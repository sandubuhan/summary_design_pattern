package com.design_pattern.demo.chainOfResponsibilityPattern.two;

/**
 * @Author sandu
 * @Date 2022-04-12 21:39
 */
public abstract class Handler {
    protected Handler successor = null;

    public void setSuccessor(Handler handler){
        this.successor = successor;
    }

    public final void handle(){
        boolean handled = doHandle();
        if (successor != null && !handled){
            successor.handle();
        }
    }

    protected abstract boolean doHandle();
}
