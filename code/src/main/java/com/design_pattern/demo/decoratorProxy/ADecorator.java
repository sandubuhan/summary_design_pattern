package com.design_pattern.demo.decoratorProxy;

/**
 * @Author sandu
 * @Date 2022-03-26 18:23
 */
public class ADecorator implements IDecorator{

    private IDecorator iDecorator;

    public ADecorator(IDecorator iDecorator) {
        this.iDecorator = iDecorator;
    }

    @Override
    public void f() {
        // 功能增强代码
        iDecorator.f();
        // 功能增强代码
    }
}
