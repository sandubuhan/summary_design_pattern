package com.design_pattern.demo.combat.darkLaunch.two;

/**
 * 抽象接口
 *
 * @Author sandu
 * @Date 2022-06-05 15:30
 */

public interface IDarkFeature {
    boolean enabled();
    boolean dark(long darkTarget);
    boolean dark(String darkTarget);
}