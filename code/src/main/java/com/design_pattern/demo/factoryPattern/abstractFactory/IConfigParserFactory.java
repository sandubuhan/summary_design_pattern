package com.design_pattern.demo.factoryPattern.abstractFactory;

/**
 * @Author sandu
 * @Date 2022-03-20 15:26
 */
public interface IConfigParserFactory {
    IRuleConfigParser createRuleParser();
    ISystemConfigParser createSystemParser();
}
