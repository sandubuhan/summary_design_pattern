package com.design_pattern.demo.chainOfResponsibilityPattern.one;

/**
 * @Author sandu
 * @Date 2022-04-12 21:10
 */
public class HandlerB extends Handler{
    @Override
    public void handle() {
        boolean handled = false;

        if (!handled && sucessor != null){
            sucessor.handle();
        }
    }
}
