package com.design_pattern.demo.chainOfResponsibilityPattern.four;

import java.rmi.dgc.Lease;

/**
 * @Author sandu
 * @Date 2022-04-12 21:57
 */
public class SexyWordFilter implements SensitiveWordFilter{
    @Override
    public boolean doFilter(Content content) {
        boolean legal = true;

        return legal;
    }
}
