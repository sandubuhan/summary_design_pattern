package com.design_pattern.demo.combat.ratelimiter.two.rule.dataSource;

import com.design_pattern.demo.combat.ratelimiter.two.rule.RuleConfig;

/**
 * 抽象接口
 *
 * @Author sandu
 * @Date 2022-05-31 20:55
 */
public interface RuleConfigSource {
    RuleConfig load();
}
