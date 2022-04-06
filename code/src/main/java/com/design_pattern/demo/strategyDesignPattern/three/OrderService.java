package com.design_pattern.demo.strategyDesignPattern.three;

/**
 * @Author sandu
 * @Date 2022-04-06 21:34
 */
public class OrderService {
    public double discount(Order order, Integer typeId) {
        OrderTypeEnum    typeEnum         = order.getType(typeId);
        DiscountStrategy discountStrategy = StrategyFactory.getDiscountStrategy(typeEnum);
        return discountStrategy.calDiscount(order);
    }
}
    