package com.design_pattern.demo.chainOfResponsibilityPattern.one;

/**
 * @Author sandu
 * @Date 2022-04-12 21:09
 */
public class HandlerA extends Handler {
    @Override
    public void handle() {
        boolean handled = false;

        // 对下一个处理器的调用
        if (!handled && sucessor != null) {
            sucessor.handle();
        }
    }
}
