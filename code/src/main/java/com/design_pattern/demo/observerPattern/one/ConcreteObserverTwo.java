package com.design_pattern.demo.observerPattern.one;

/**
 * @Author sandu
 * @Date 2022-04-04 16:49
 */
public class ConcreteObserverTwo implements Observer{
    @Override
    public void update(Message message) {
        System.out.println("two");
    }
}
