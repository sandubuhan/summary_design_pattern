package com.design_pattern.demo.strategyDesignPattern.two;

import com.design_pattern.demo.strategyDesignPattern.one.ConcreteStrategyA;
import com.design_pattern.demo.strategyDesignPattern.one.ConcreteStrategyB;
import com.design_pattern.demo.strategyDesignPattern.one.Strategy;

/**
 * @Author sandu
 * @Date 2022-04-06 21:22
 */
public class StrategyFactoryWithState {
    public static Strategy getStrategy(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }

        if (type.equals("A")) {
            return new ConcreteStrategyA();
        } else if (type.equals("B")) {
            return new ConcreteStrategyB();
        }

        return null;
    }
}
