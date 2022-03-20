package com.design_pattern.demo.builderPattern;


import org.apache.commons.lang3.StringUtils;

/**
 * @Author sandu
 * @Date 2022-03-20 21:22
 */
public class ResourcePoolConfigBuilder {

    private static final int DEFAULT_MAX_TOTAL = 8;
    private static final int DEFAULT_MAX_IDLE = 8;
    private static final int DEFAULT_MIN_IDLE = 0;

    private String name;
    private int maxTotal = DEFAULT_MAX_TOTAL;
    private int maxIdle = DEFAULT_MAX_IDLE;
    private int minIdle = DEFAULT_MIN_IDLE;

    public ResourcePoolConfig build() {
        if (StringUtils.isBlank(name)) {
            throw new IllegalArgumentException("...");
        } else if (maxIdle > maxTotal) {
            throw new IllegalArgumentException("...");
        } else if (minIdle > maxTotal || minIdle > maxIdle) {
            throw new IllegalArgumentException("...");
        }
        return new ResourcePoolConfig(this);
    }

    public ResourcePoolConfigBuilder setName(String name) {
        if (!StringUtils.isBlank(name)) {
            this.name = name;
            return this;
        }
        throw new IllegalArgumentException("...");
    }

    public ResourcePoolConfigBuilder setMaxTotal(int maxTotal) {
        if (maxTotal <= 0) {
            throw new IllegalArgumentException("...");
        }
        this.maxTotal = maxTotal;
        return this;
    }

    public ResourcePoolConfigBuilder setMaxIdle(int maxIdle) {
        if (maxIdle < 0) {
            throw new IllegalArgumentException("...");
        }
        this.maxIdle = maxIdle;
        return this;
    }


}
