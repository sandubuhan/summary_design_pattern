package com.design_pattern.demo.factoryPattern.simpleFactory;

/**
 * @Author sandu
 * @Date 2022-03-20 10:41
 */
public interface IRuleConfigParser {
    RuleConfig parse(String configText);
}
