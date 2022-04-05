package com.design_pattern.demo.templateMethodPattern.one;

/**
 * @Author sandu
 * @Date 2022-04-05 15:31
 */
public abstract class AbstractClass {
    public final void templateMethod(){

        method1();

        method2();
    }

    protected abstract void method1();
    protected abstract void method2();
}
