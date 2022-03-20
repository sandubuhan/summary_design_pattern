package com.design_pattern.demo.factoryPattern.diFrame;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author sandu
 * @Date 2022-03-20 16:53
 */
@Component
@Data
public class BeanDefinition {
    private String id;
    private String className;
    private List<ConstructorArg> constructorArgs = new ArrayList<>();
    private Scope scope = Scope.SINGLETON;
    private boolean lazyInit = false;
    // 省略必要的getter/setter/constructors

    public boolean isSingleton() {
        return scope.equals(Scope.SINGLETON);
    }

    public BeanDefinition get(BeanDefinition beanDefinition) {
        return new BeanDefinition();
    }


    public static enum Scope {
        SINGLETON,
        PROTOTYPE
    }

    public static class ConstructorArg {
        private boolean isRef;
        private Class type;
        private Object arg;

        public boolean getIsRef() {
            return true;
        }

        public Class getType() {
            return null;
        }

        public String getArg() {
            return null;
        }
        // 省略必要的getter/setter/constructors
    }
}




