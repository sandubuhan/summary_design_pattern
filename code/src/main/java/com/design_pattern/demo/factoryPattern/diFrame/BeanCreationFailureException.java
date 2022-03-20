package com.design_pattern.demo.factoryPattern.diFrame;

/**
 * @Author sandu
 * @Date 2022-03-20 18:06
 */
public class BeanCreationFailureException extends RuntimeException {
    public BeanCreationFailureException(String s, ReflectiveOperationException e) {

    }
}
