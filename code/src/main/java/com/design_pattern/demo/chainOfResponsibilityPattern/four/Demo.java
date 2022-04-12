package com.design_pattern.demo.chainOfResponsibilityPattern.four;

/**
 * @Author sandu
 * @Date 2022-04-12 22:03
 */
public class Demo {
    public static void main(String[] args) {
        SensitiveWordFilterChain filterChain = new SensitiveWordFilterChain();
        filterChain.addFilter(new SexyWordFilter());
        boolean legal = filterChain.filter(new Content());
        if (!legal) {
            // 不发表
        } else {
            // 发表
        }

    }
}
