package com.design_pattern.demo.decoratorPattern;

import java.util.Arrays;

/**
 * @Author sandu
 * @Date 2022-03-26 18:22
 */
public class A implements IDecorator{
    @Override
    public void f() {

        Arrays.asList("Aarra","aaaa");
        System.out.println("A");
    }
}
