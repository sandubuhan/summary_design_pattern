package com.design_pattern.demo.chainOfResponsibilityPattern.one;

/**
 * 所有处理器的抽象父类
 *
 * @Author sandu
 * @Date 2022-04-12 21:08
 */
public abstract class Handler {
    protected Handler sucessor = null;

    public void setSucessor(Handler sucessor) {
        this.sucessor = sucessor;
    }

    public abstract void handle();
}
