package com.design_pattern.demo.proxyPattern.interfaceProxy;

import com.design_pattern.demo.proxyPattern.MetricsCollector;

/**
 * @Author sandu
 * @Date 2022-03-22 21:16
 */
public class ClientIP {
    public static void main(String[] args) {
        UserControllerIPProxy userControllerIPProxy = new UserControllerIPProxy(new MetricsCollector(), new UserControllerIP());
        userControllerIPProxy.login("1111","2222");
    }
}
