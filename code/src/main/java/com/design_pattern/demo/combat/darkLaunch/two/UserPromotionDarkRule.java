package com.design_pattern.demo.combat.darkLaunch.two;

/**
 * 编程实现的灰度规则
 *
 * @Author sandu
 * @Date 2022-06-05 15:36
 */
public class UserPromotionDarkRule implements IDarkFeature {
    @Override
    public boolean enabled() {
        return true;
    }

    @Override
    public boolean dark(long darkTarget) {
        // 灰度规则自己想怎么写就怎么写
        return false;
    }

    @Override
    public boolean dark(String darkTarget) {
        // 灰度规则自己想怎么写就怎么写
        return false;
    }
}