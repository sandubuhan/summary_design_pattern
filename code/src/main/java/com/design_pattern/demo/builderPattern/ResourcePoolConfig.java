package com.design_pattern.demo.builderPattern;

/**
 * @Author sandu
 * @Date 2022-03-20 21:21
 */
public class ResourcePoolConfig {

    private String name;
    private int maxTotal;
    private int maxIdle;
    private int minIdle;

    ResourcePoolConfig(ResourcePoolConfigBuilder builder){

    }


}
