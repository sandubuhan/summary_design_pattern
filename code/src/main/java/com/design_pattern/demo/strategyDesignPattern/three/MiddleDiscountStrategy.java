package com.design_pattern.demo.strategyDesignPattern.three;

/**
 * @Author sandu
 * @Date 2022-04-06 21:26
 */
public class MiddleDiscountStrategy implements DiscountStrategy{
    @Override
    public double calDiscount(Order order) {
        return 0;
    }
}
