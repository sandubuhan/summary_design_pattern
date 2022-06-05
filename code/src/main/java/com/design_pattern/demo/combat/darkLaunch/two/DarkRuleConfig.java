package com.design_pattern.demo.combat.darkLaunch.two;

import java.util.List;

/**
 * 用来映射配置到内存中，代码不变
 *
 * @Author sandu
 * @Date 2022-06-05 15:31
 */
public class DarkRuleConfig {
    private List<DarkFeatureConfig> features;

    public List<DarkFeatureConfig> getFeatures() {
        return this.features;
    }

    public void setFeatures(List<DarkRuleConfig.DarkFeatureConfig> features) {
        this.features = features;
    }

    public static class DarkFeatureConfig {
        private String key;
        private boolean enabled;
        private String rule;

        public String getKey() {
            return null;
        }

        public boolean getEnabled() {
            return false;
        }

        // 省略getter、setter方法
    }
}
