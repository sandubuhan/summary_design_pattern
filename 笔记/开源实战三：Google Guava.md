# 开源实战三：Google Guava

+ Google Guava是Google内部Java开发工具库的开源版本，提供了一些JDK没有的功能，以及某些功能的增强。

## 如何发现按通用的功能模块

+ 在业务开发中，跟业务无关的通用功能模块，常见的有三类：类库、框架、功能组件
+ 特点：复用、业务无关

## 如何开发通用的功能模块

+ 对于这些类库、框架、功能组件的开发，我们不能闭门造车，要把它们当作“产品”来开发。这个产品是一个“技术产品”，我们的目标用户是“程序员”，解决的是他们的“开发痛点”
+ 对于一个技术产品来说，尽管 Bug 少、性能好等技术指标至关重要，但是否易用、易集成、易插拔、文档是否全面、是否容易上手等，这些产品素质也非常重要，甚至还能起到决定性作用。

## Builder模式在Guava中的应用

+ 使用 Google Guava 来构建内存缓存

~~~java

public class CacheDemo {
  public static void main(String[] args) {
    Cache<String, String> cache = CacheBuilder.newBuilder()
            .initialCapacity(100)
            .maximumSize(1000)
            .expireAfterWrite(10, TimeUnit.MINUTES)
            .build();

    cache.put("key1", "value1");
    String value = cache.getIfPresent("key1");
    System.out.println(value);
  }
}
~~~



+ 构建一个缓存，需要配置 n 多参数，比如过期时间、淘汰策略、最大缓存大小等等。相应地，Cache 类就会包含 n 多成员变量。我们需要在构造函数中，设置这些成员变量的值，但又不是所有的值都必须设置，设置哪些值由用户来决定。为了满足这个需求，我们就需要定义多个包含不同参数列表的构造函数。

+ 为了避免构造函数的参数列表过长、不同的构造函数过多，我们一般有两种解决方案。其中，一个解决方案是使用 Builder 模式；另一个方案是先通过无参构造函数创建对象，然后再通过 setXXX() 方法来逐一设置需要的设置的成员变量。

+ 那我再问你一个问题，为什么 Guava 选择第一种而不是第二种解决方案呢？使用第二种解决方案是否也可以呢？答案是不行的。至于为什么，我们看下源码就清楚了。我把 CacheBuilder 类中的 build() 函数摘抄到了下面，你可以先看下。

~~~java

public <K1 extends K, V1 extends V> Cache<K1, V1> build() {
  this.checkWeightWithWeigher();
  this.checkNonLoadingCache();
  return new LocalManualCache(this);
}

private void checkNonLoadingCache() {
  Preconditions.checkState(this.refreshNanos == -1L, "refreshAfterWrite requires a LoadingCache");
}

private void checkWeightWithWeigher() {
  if (this.weigher == null) {
    Preconditions.checkState(this.maximumWeight == -1L, "maximumWeight requires weigher");
  } else if (this.strictParsing) {
    Preconditions.checkState(this.maximumWeight != -1L, "weigher requires maximumWeight");
  } else if (this.maximumWeight == -1L) {
    logger.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
  }

}
~~~

+ 必须使用 Builder 模式的主要原因是，在真正构造 Cache 对象的时候，我们必须做一些必要的参数校验，也就是 build() 函数中前两行代码要做的工作。如果采用无参默认构造函数加 setXXX() 方法的方案，这两个校验就无处安放了

## Wrapper 模式在 Guava 中的应用

+ 在 Google Guava 的 collection 包路径下，有一组以 Forwarding 开头命名的类

+ 其中的 ForwardingCollection 中的部分代码在这里

~~~java

@GwtCompatible
public abstract class ForwardingCollection<E> extends ForwardingObject implements Collection<E> {
  protected ForwardingCollection() {
  }

  protected abstract Collection<E> delegate();

  public Iterator<E> iterator() {
    return this.delegate().iterator();
  }

  public int size() {
    return this.delegate().size();
  }

  @CanIgnoreReturnValue
  public boolean removeAll(Collection<?> collection) {
    return this.delegate().removeAll(collection);
  }

  public boolean isEmpty() {
    return this.delegate().isEmpty();
  }

  public boolean contains(Object object) {
    return this.delegate().contains(object);
  }

  @CanIgnoreReturnValue
  public boolean add(E element) {
    return this.delegate().add(element);
  }

  @CanIgnoreReturnValue
  public boolean remove(Object object) {
    return this.delegate().remove(object);
  }

  public boolean containsAll(Collection<?> collection) {
    return this.delegate().containsAll(collection);
  }

  @CanIgnoreReturnValue
  public boolean addAll(Collection<? extends E> collection) {
    return this.delegate().addAll(collection);
  }

  @CanIgnoreReturnValue
  public boolean retainAll(Collection<?> collection) {
    return this.delegate().retainAll(collection);
  }

  public void clear() {
    this.delegate().clear();
  }

  public Object[] toArray() {
    return this.delegate().toArray();
  }
  
  //...省略部分代码...
}
~~~

+ 用法实例

~~~java

public class AddLoggingCollection<E> extends ForwardingCollection<E> {
  private static final Logger logger = LoggerFactory.getLogger(AddLoggingCollection.class);
  private Collection<E> originalCollection;

  public AddLoggingCollection(Collection<E> originalCollection) {
    this.originalCollection = originalCollection;
  }

  @Override
  protected Collection delegate() {
    return this.originalCollection;
  }

  @Override
  public boolean add(E element) {
    logger.info("Add element: " + element);
    return this.delegate().add(element);
  }

  @Override
  public boolean addAll(Collection<? extends E> collection) {
    logger.info("Size of elements to add: " + collection.size());
    return this.delegate().addAll(collection);
  }

}
~~~

+ 在上面的代码中，AddLoggingCollection 是基于代理模式实现的一个代理类，它在原始 Collection 类的基础之上，针对“add”相关的操作，添加了记录日志的功能。

+ 代理模式、装饰器、适配器模式可以统称为 Wrapper 模式，通过 Wrapper 类二次封装原始类。它们的代码实现也很相似，都可以通过组合的方式，将 Wrapper 类的函数实现委托给原始类的函数来实现。

~~~java

public interface Interf {
  void f1();
  void f2();
}
public class OriginalClass implements Interf {
  @Override
  public void f1() { //... }
  @Override
  public void f2() { //... }
}

public class WrapperClass implements Interf {
  private OriginalClass oc;
  public WrapperClass(OriginalClass oc) {
    this.oc = oc;
  }
  @Override
  public void f1() {
    //...附加功能...
    this.oc.f1();
    //...附加功能...
  }
  @Override
  public void f2() {
    this.oc.f2();
  }
}
~~~

+ 实际上，这个 ForwardingCollection 类是一个“默认 Wrapper 类”或者叫“缺省 Wrapper 类”
+ 如果我们不使用这个 ForwardinCollection 类，而是让 AddLoggingCollection 代理类直接实现 Collection 接口，那 Collection 接口中的所有方法，都要在 AddLoggingCollection 类中实现一遍，而真正需要添加日志功能的只有 add() 和 addAll() 两个函数，其他函数的实现，都只是类似 Wrapper 类中 f2() 函数的实现那样，简单地委托给原始 collection 类对象的对应函数。
+ 为了简化 Wrapper 模式的代码实现，Guava 提供一系列缺省的 Forwarding 类。用户在实现自己的 Wrapper 类的时候，基于缺省的 Forwarding 类来扩展，就可以只实现自己关心的方法，其他不关心的方法使用缺省 Forwarding 类的实现，就像 AddLoggingCollection 类的实现那样。

## 函数式编程

+ 现在主流的编程范式主要有三种，面向过程、面向对象和函数式编程。
+ 严格上来讲，函数式编程中的“函数”，并不是指我们编程语言中的“函数”概念，而是指数学“函数”或者“表达式”（比如，y=f(x)）。
+ 每个编程范式都有自己独特的地方，这就是它们会被抽象出来作为一种范式的原因。面向对象编程最大的特点是：以类、对象作为组织代码的单元以及它的四大特性。面向过程编程最大的特点是：以函数作为组织代码的单元，数据与方法相分离。
+ 函数式编程最独特的地方在于它的编程思想。函数式编程认为，程序可以用一系列数学函数或表达式的组合来表示。函数式编程是程序面向数学的更底层的抽象，将计算过程描述为表达式。
+ 函数式编程有它自己适合的应用场景，比如开篇提到的科学计算、数据处理、统计分析等。
+ 函数式编程跟面向过程编程一样，也是以函数作为组织代码的单元。不过，它跟面向过程编程的区别在于，它的函数是无状态的。何为无状态？简单点讲就是，函数内部涉及的变量都是局部变量，不会像面向对象编程那样，共享类成员变量，也不会像面向过程编程那样，共享全局变量。函数的执行结果只与入参有关，跟其他任何外部变量无关。同样的入参，不管怎么执行，得到的结果都是一样的。

~~~java

// 有状态函数: 执行结果依赖b的值是多少，即便入参相同，多次执行函数，函数的返回值有可能不同，因为b值有可能不同。
int b;
int increase(int a) {
  return a + b;
}

// 无状态函数：执行结果不依赖任何外部变量值，只要入参相同，不管执行多少次，函数的返回值就相同
int increase(int a, int b) {
  return a + b;
}
~~~

## Java 中的函数式编程

~~~java

public class FPDemo {
  public static void main(String[] args) {
    Optional<Integer> result = Stream.of("f", "ba", "hello")
            .map(s -> s.length())
            .filter(l -> l <= 3)
            .max((o1, o2) -> o1-o2);
    System.out.println(result.get()); // 输出2
  }
}
~~~

+ Java 为函数式编程引入了三个新的语法概念：Stream 类、Lambda 表达式和函数接口（Functional Inteface）
+ Stream 类用来支持通过“.”级联多个函数操作的代码编写方式；引入 Lambda 表达式的作用是简化代码编写；函数接口的作用是让我们可以把函数包裹成函数接口，来实现把函数当做参数一样来使用（Java 不像 C 一样支持函数指针，可以把函数直接当参数来使用）。

## Guava 对函数式编程的增强

+ 颠覆式创新是很难的。不过我们可以进行一些补充，一方面，可以增加 Stream 类上的操作（类似 map、filter、max 这样的终止操作和中间操作），另一方面，也可以增加更多的函数接口（类似 Function、Predicate 这样的函数接口）。实际上，我们还可以设计一些类似 Stream 类的新的支持级联操作的类。这样，使用 Java 配合 Guava 进行函数式编程会更加方便。但是，跟我们预期的相反，Google Guava 并没有提供太多函数式编程的支持，仅仅封装了几个遍历集合操作的接口，

~~~java

Iterables.transform(Iterable, Function);
Iterators.transform(Iterator, Function);
Collections.transfrom(Collection, Function);
Lists.transform(List, Function);
Maps.transformValues(Map, Function);
Multimaps.transformValues(Mltimap, Function);
...
Iterables.filter(Iterable, Predicate);
Iterators.filter(Iterator, Predicate);
Collections2.filter(Collection, Predicate);
...
~~~

+ 从 Google Guava 的 GitHub Wiki 中，我们发现，Google 对于函数式编程的使用还是很谨慎的，认为过度地使用函数式编程，会导致代码可读性变差，强调不要滥用。这跟我前面对函数式编程的观点是一致的。所以，在函数式编程方面，Google Guava 并没有提供太多的支持。



