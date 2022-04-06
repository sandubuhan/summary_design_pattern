package com.design_pattern.demo.strategyDesignPattern.three;

/**
 * @Author sandu
 * @Date 2022-04-06 21:32
 */
public class HighDiscountStrategy implements DiscountStrategy{

    @Override
    public double calDiscount(Order order) {
        return 0;
    }
}
