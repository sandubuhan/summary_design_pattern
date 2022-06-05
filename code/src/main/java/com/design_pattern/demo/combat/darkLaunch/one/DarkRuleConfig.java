package com.design_pattern.demo.combat.darkLaunch.one;

import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * 用来映射配置到内存中
 * 只是用来将灰度规则映射到内存中。
 *
 * @Author sandu
 * @Date 2022-06-05 14:00
 */

public class DarkRuleConfig {
    private List<DarkFeatureConfig> features;

    public List<DarkFeatureConfig> getFeatures() {
        return this.features;
    }

    public void setFeatures(List<DarkFeatureConfig> features) {
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