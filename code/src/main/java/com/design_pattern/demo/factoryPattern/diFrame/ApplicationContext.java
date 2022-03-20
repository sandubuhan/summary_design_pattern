package com.design_pattern.demo.factoryPattern.diFrame;

/**
 * @Author sandu
 * @Date 2022-03-20 16:50
 */
public interface ApplicationContext {
    Object getBean(String beanId);
}
