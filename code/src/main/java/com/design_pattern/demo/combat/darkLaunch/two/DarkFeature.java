package com.design_pattern.demo.combat.darkLaunch.two;

/**
 * 基于配置文件的灰度规则，有改动
 *
 * @Author sandu
 * @Date 2022-06-05 15:30
 */
public class DarkFeature implements IDarkFeature{


    public DarkFeature(DarkRuleConfig.DarkFeatureConfig darkFeatureConfig) {

    }

    @Override
    public boolean enabled() {
        return false;
    }

    @Override
    public boolean dark(long darkTarget) {
        return false;
    }

    @Override
    public boolean dark(String darkTarget) {
        return false;
    }
}
