package com.design_pattern.demo.combat.ratelimiter.two;

import com.design_pattern.demo.combat.ratelimiter.two.alg.RateLimitAlg;
import com.design_pattern.demo.combat.ratelimiter.two.rule.RateLimitRule;
import com.design_pattern.demo.combat.ratelimiter.two.rule.RuleConfig;
import com.design_pattern.demo.combat.ratelimiter.two.rule.TrieRateLimitRule;
import com.design_pattern.demo.combat.ratelimiter.two.rule.dataSource.FileRuleConfigSource;
import com.design_pattern.demo.combat.ratelimiter.two.rule.dataSource.RuleConfigSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 代码的改动集中在构造函数中，通过调用 RuleConfigSource 来实现了限流规则配置文件的加载。
 *
 * @Author sandu
 * @Date 2022-05-31 20:53
 */

public class RateLimiter {
    private static final Logger log = LoggerFactory.getLogger(RateLimiter.class);
    // 为每个api在内存中存储限流计数器
    private ConcurrentHashMap<String, RateLimitAlg> counters = new ConcurrentHashMap<>();
    private RateLimitRule rule;

    public RateLimiter() {
        //改动主要在这里：调用RuleConfigSource类来实现配置加载
        RuleConfigSource configSource = new FileRuleConfigSource();
        RuleConfig       ruleConfig   = configSource.load();
        this.rule = new TrieRateLimitRule(ruleConfig);
    }

    public boolean limit(String appId, String url) throws Exception {
        //...代码不变...
        return false;
    }
}