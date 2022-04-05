package com.design_pattern.demo.templateMethodPattern.callBack;

/**
 * @Author sandu
 * @Date 2022-04-05 17:22
 */
public class AClass {
    public static void main(String[] args) {
        BClass bClass = new BClass();
        bClass.process(new ICallBack() {
            @Override
            public void methodToCallback() {
                System.out.println("call back me");
            }
        });
    }
}
