package com.design_pattern.demo.adapterPattern.unifyingMultiple;

/**
 * B敏感词过滤系统
 *
 * @Author sandu
 * @Date 2022-03-27 9:32
 */
public class BSensitiveWordsFilter {
    public String filter(String text) {
        return "sensitive";
    }
}
