package com.design_pattern.demo.factoryPattern.diFrame;

import org.springframework.beans.factory.config.BeanDefinition;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author sandu
 * @Date 2022-03-20 17:07
 */
public class XmlBeanConfigParser implements BeanConfigParser{
    @Override
    public List<BeanDefinition> parse(InputStream inputStream) {
        String content = null;
        return parse(content);
    }

    @Override
    public List<BeanDefinition> parse(String configContent) {
        List beanDefinitions = new ArrayList<>();
        return beanDefinitions;
    }
}
