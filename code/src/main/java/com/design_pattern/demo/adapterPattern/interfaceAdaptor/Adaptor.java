package com.design_pattern.demo.adapterPattern.interfaceAdaptor;

/**
 * @Author sandu
 * @Date 2022-03-27 9:13
 */
public class Adaptor implements ITarget {
    private Adaptee adaptee;

    public Adaptor(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void f1() {
        // 委托给Adaptee
        adaptee.fa();
    }

    @Override
    public void f2() {

    }

    @Override
    public void f3() {
        adaptee.fc();
    }
}
