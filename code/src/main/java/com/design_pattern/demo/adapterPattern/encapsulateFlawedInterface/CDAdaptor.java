package com.design_pattern.demo.adapterPattern.encapsulateFlawedInterface;

/**
 * @Author sandu
 * @Date 2022-03-27 9:30
 */
public class CDAdaptor extends CD implements ITarget {

    private CD cd;

    public CDAdaptor(CD cd) {
        this.cd = cd;
    }

    @Override
    public void f1() {
        cd.lowPerformanceFunction();
    }

    @Override
    public void f2() {
        cd.tooManyParamsFunction(1, 2);
    }

    @Override
    public void f3() {
        cd.uglyNamingFunction();
    }

    @Override
    public void f4() {

    }
}
