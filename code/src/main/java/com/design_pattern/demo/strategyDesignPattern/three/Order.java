package com.design_pattern.demo.strategyDesignPattern.three;

/**
 * @Author sandu
 * @Date 2022-04-06 21:25
 */
public class Order {
    public OrderTypeEnum getType(Integer typeId) {

        return OrderTypeEnum.getEnumById(typeId);
    }
}
