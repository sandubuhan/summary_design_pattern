package com.design_pattern.demo.templateMethodPattern.callBack;

/**
 * @Author sandu
 * @Date 2022-04-05 17:21
 */
public class BClass {
    public void process(ICallBack iCallBack){
        iCallBack.methodToCallback();
    }
}
