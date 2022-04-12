package com.design_pattern.demo.chainOfResponsibilityPattern.three;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author sandu
 * @Date 2022-04-12 21:54
 */
public class Demo {
    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.handle();
    }
}

