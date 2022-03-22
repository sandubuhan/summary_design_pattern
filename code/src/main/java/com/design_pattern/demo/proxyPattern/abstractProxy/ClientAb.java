package com.design_pattern.demo.proxyPattern.abstractProxy;

import com.design_pattern.demo.proxyPattern.MetricsCollector;

/**
 * @Author sandu
 * @Date 2022-03-22 21:19
 */
public class ClientAb {
    public static void main(String[] args) {
        UserControllerAbProxy userControllerAbProxy = new UserControllerAbProxy(new MetricsCollector());
    }
}
