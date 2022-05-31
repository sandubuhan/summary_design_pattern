package com.design_pattern.demo.combat.ratelimiter.one.rule;

import lombok.Data;

/**
 * @Author sandu
 * @Date 2022-05-29 19:21
 */
@Data
public class ApiLimit {
    private static final int DEFAULT_TIME_UNIT = 1; // 1 second
    private String api;
    private int limit;
    private int unit = DEFAULT_TIME_UNIT;

    public ApiLimit() {}

    public ApiLimit(String api, int limit) {
        this(api, limit, DEFAULT_TIME_UNIT);
    }

    public ApiLimit(String api, int limit, int unit) {
        this.api = api;
        this.limit = limit;
        this.unit = unit;
    }
    // ...省略getter、setter方法...
}