package com.design_pattern.demo.ObserverPattern.one;

/**
 * @Author sandu
 * @Date 2022-04-04 16:48
 */
public class Demo {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        ConcreteObserverOne concreteObserverOne = new ConcreteObserverOne();
        ConcreteObserverTwo concreteObserverTwo = new ConcreteObserverTwo();
        concreteSubject.registerObserver(concreteObserverOne);
        concreteSubject.registerObserver(concreteObserverTwo);
        concreteSubject.notifyObservers(new Message());
    }
}
