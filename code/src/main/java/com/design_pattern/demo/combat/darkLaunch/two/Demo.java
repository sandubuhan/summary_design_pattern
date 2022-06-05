package com.design_pattern.demo.combat.darkLaunch.two;

/**
 * @Author sandu
 * @Date 2022-06-05 15:36
 */
/*
灰度规则配置(dark-rule.yaml)，放到classpath路径下
features:
        - key: call_newapi_getUserById
        enabled: true
        rule: {893,342,1020-1120,%30}
        - key: call_newapi_registerUser
        enabled: true
        rule: {1391198723, %10}
        - key: newalgo_loan
        enabled: true
        rule: {0-100}*/


public class Demo {
    public static void main(String[] args) {
        /**
         * 默认加载classpath下dark-rule.yaml文件中的灰度规则
         */
        DarkLaunch darkLaunch = new DarkLaunch();
        /**
         * 添加编程实现的灰度规则
         */
        darkLaunch.addProgrammedDarkFeature("user_promotion", new UserPromotionDarkRule());
        IDarkFeature darkFeature = darkLaunch.getDarkFeature("user_promotion");
        System.out.println(darkFeature.enabled());
        System.out.println(darkFeature.dark(893));
    }
}
