package com.design_pattern.demo.factoryPattern.diFrame;

import org.springframework.beans.factory.config.BeanDefinition;

import java.io.InputStream;
import java.util.List;

/**
 * @Author sandu
 * @Date 2022-03-20 16:52
 */
public interface BeanConfigParser {
    List<BeanDefinition> parse(InputStream inputStream);
    List<BeanDefinition> parse(String configContent);
}
