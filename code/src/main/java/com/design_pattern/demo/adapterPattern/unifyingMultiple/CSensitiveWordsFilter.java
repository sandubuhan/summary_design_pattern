package com.design_pattern.demo.adapterPattern.unifyingMultiple;

/**
 * C敏感词过滤系统
 *
 * @Author sandu
 * @Date 2022-03-27 9:33
 */
public class CSensitiveWordsFilter {
    public String filter(String text, String mask) {
        return "sensitive";
    }
}
