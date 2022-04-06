package com.design_pattern.demo.strategyDesignPattern.two;

import com.design_pattern.demo.strategyDesignPattern.one.ConcreteStrategyA;
import com.design_pattern.demo.strategyDesignPattern.one.ConcreteStrategyB;
import com.design_pattern.demo.strategyDesignPattern.one.Strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author sandu
 * @Date 2022-04-06 21:19
 */
public class StrategyFactoryWithNoState {
    private static final Map<String , Strategy> strategies = new HashMap<>();

    static {
        strategies.put("A",new ConcreteStrategyA());
        strategies.put("B",new ConcreteStrategyB());
    }

    public static Strategy getStrategy(String type){
        if (type == null || type.isEmpty()){
            throw new IllegalArgumentException("type should not be empty");
        }
        return strategies.get(type);
    }
}
