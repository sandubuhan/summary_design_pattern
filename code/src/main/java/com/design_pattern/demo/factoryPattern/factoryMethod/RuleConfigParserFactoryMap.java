package com.design_pattern.demo.factoryPattern.factoryMethod;

import com.design_pattern.demo.factoryPattern.simpleFactory.InvalidRuleConfigException;
import com.design_pattern.demo.factoryPattern.simpleFactory.RuleConfig;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author sandu
 * @Date 2022-03-20 15:21
 */
//因为工厂类只包含方法，不包含成员变量，完全可以复用，
//不需要每次都创建新的工厂类对象，所以，简单工厂模式的第二种实现思路更加合适。
public class RuleConfigParserFactoryMap { //工厂的工厂
    private static final Map<String, IRuleConfigParserFactory> cachedFactories = new HashMap<>();

    static {
        cachedFactories.put("json", new JsonRuleConfigParserFactory());
        cachedFactories.put("xml", new XmlRuleConfigParserFactory());
    }

    public static IRuleConfigParserFactory getParserFactory(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        IRuleConfigParserFactory parserFactory = cachedFactories.get(type.toLowerCase());
        return parserFactory;
    }
}