package com.design_pattern.demo.strategyDesignPattern.three;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author sandu
 * @Date 2022-04-06 21:26
 */
public class StrategyFactory {
    private static final Map<OrderTypeEnum, DiscountStrategy> strategies = new HashMap<>();

    static {
        strategies.put(OrderTypeEnum.NORMAL, new NormalDiscountStrategy());
        strategies.put(OrderTypeEnum.MIDDLE, new MiddleDiscountStrategy());
        strategies.put(OrderTypeEnum.HIGH, new HighDiscountStrategy());
    }

    public static DiscountStrategy getDiscountStrategy(OrderTypeEnum type){
        return strategies.get(type);
    }
}
