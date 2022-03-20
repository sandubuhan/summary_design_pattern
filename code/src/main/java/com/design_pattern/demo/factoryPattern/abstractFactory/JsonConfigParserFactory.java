package com.design_pattern.demo.factoryPattern.abstractFactory;

/**
 * @Author sandu
 * @Date 2022-03-20 15:28
 */
public class JsonConfigParserFactory implements IConfigParserFactory{
    @Override
    public IRuleConfigParser createRuleParser() {
        return new JsonRuleConfigParser();
    }

    @Override
    public ISystemConfigParser createSystemParser() {
        return new JsonSystemConfigParser();
    }
}
