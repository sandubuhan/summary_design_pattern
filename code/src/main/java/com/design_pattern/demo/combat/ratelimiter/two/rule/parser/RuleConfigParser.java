package com.design_pattern.demo.combat.ratelimiter.two.rule.parser;

import com.design_pattern.demo.combat.ratelimiter.two.rule.RuleConfig;

import java.io.InputStream;

/**
 * 抽象接口
 * 各个 Parser 和 RuleConfigSource 类的设计有点类似策略模式，
 * 如果要添加新的格式的解析，只需要实现对应的 Parser 类，并且添加到 FileRuleConfig 类的 PARSER_MAP 中就可以了。
 *
 * @Author sandu
 * @Date 2022-05-31 20:55
 */
public interface RuleConfigParser {
    RuleConfig parse(String configText);
    RuleConfig parse(InputStream inputStream);
}
