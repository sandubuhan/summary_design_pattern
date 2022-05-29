package com.design_pattern.demo.combat.ratelimiter.one;

import com.design_pattern.demo.combat.ratelimiter.one.alg.RateLimitAlg;
import com.design_pattern.demo.combat.ratelimiter.one.rule.RateLimitRule;
import com.design_pattern.demo.combat.ratelimiter.one.rule.RuleConfig;
import lombok.extern.slf4j.Slf4j;

import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author sandu
 * @Date 2022-05-29 19:17
 */
@Slf4j
public class RateLimiter {
    /**
     * 为每个api在内存中存储限流计数器
     */
    private ConcurrentHashMap<String, RateLimitAlg> counters = new ConcurrentHashMap<String, RateLimitAlg>();

    private RateLimitRule rule;

    public RateLimiter(){
        InputStream in;
        RuleConfig  ruleConfig =null;
    }

}
