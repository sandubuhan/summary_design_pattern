package com.design_pattern.demo.adapterPattern.unifyingMultiple;

/**
 * @Author sandu
 * @Date 2022-03-27 9:36
 */
public class ASensitiveWordsFilterAdaptor implements ISensitiveWordsFilter {

    private ASensitiveWordsFilter aSensitiveWordsFilter;

    @Override
    public String filter(String text) {
        String s = aSensitiveWordsFilter.filterSexyWords(text);
        return s;
    }
}
