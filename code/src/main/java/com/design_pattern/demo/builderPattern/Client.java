package com.design_pattern.demo.builderPattern;

/**
 * @Author sandu
 * @Date 2022-03-20 21:49
 */
public class Client {
    public static void main(String[] args) {
        ResourcePoolConfig aaaa = new ResourcePoolConfigBuilder()
                .setMaxIdle(1)
                .setMaxTotal(2)
                .setName("aaaa")
                .build();
    }
}
