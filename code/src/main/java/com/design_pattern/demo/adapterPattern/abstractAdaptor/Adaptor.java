package com.design_pattern.demo.adapterPattern.abstractAdaptor;

/**
 * @Author sandu
 * @Date 2022-03-27 9:09
 */
public class Adaptor extends Adaptee implements ITarget {
    @Override
    public void f1() {
        super.fa();
    }

    @Override
    public void f2() {
        // 重新实现f2
    }

    @Override
    public void f3() {
        super.fc();
    }
}
