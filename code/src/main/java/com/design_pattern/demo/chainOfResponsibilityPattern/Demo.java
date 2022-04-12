package com.design_pattern.demo.chainOfResponsibilityPattern;

import com.design_pattern.demo.chainOfResponsibilityPattern.one.HandlerA;
import com.design_pattern.demo.chainOfResponsibilityPattern.one.HandlerB;

/**
 * @Author sandu
 * @Date 2022-04-12 21:20
 */
public class Demo {
    public static void main(String[] args) {
        HandlerChain handlerChain = new HandlerChain();
        handlerChain.addHandler(new HandlerA());
        handlerChain.addHandler(new HandlerB());
        handlerChain.handle();
    }
}
