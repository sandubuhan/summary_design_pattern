package com.design_pattern.demo.factoryPattern.factoryMethod;

import com.design_pattern.demo.factoryPattern.simpleFactory.RuleConfig;

/**
 * @Author sandu
 * @Date 2022-03-20 11:05
 */
public interface IRuleConfigParser {
    IRuleConfigParser createParser(String configText);

    RuleConfig parse(String configText);
}
