package com.design_pattern.demo.ObserverPattern.handwrittenEvenbus;

/**
 * @Author sandu
 * @Date 2022-04-05 11:08
 */
public class ObserverAction {
    private Object target;
    private Method method;

    public ObserverAction(Object target, Method method) {
        this.target = target;
//        this.method = method;
//        this.method.setAccessible(true);
    }

    public void execute(Object event){
        method.invoke(target,event);
    }
}
