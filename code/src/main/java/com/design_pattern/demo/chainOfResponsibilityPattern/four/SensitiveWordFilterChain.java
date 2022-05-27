package com.design_pattern.demo.chainOfResponsibilityPattern.four;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author sandu
 * @Date 2022-04-12 22:02
 */
public class SensitiveWordFilterChain {
    private List<SensitiveWordFilter> filters = new ArrayList<>();

    public void addFilter(SensitiveWordFilter filter) {
        this.filters.add(filter);
    }

    public boolean filter(Content content) {
        for (SensitiveWordFilter filter : filters) {
            if (!filter.doFilter(content)) {
                return false;
            }
        }
        return true;
    }
}
