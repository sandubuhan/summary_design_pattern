package com.design_pattern.demo.factoryPattern.simpleFactory;

import lombok.Getter;

/**
 * @Author sandu
 * @Date 2022-03-20 10:45
 */
@Getter
public class InvalidRuleConfigException extends RuntimeException {
    public InvalidRuleConfigException(String s) {

    }
}
