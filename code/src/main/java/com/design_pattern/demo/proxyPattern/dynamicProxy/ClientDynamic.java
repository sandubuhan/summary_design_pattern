package com.design_pattern.demo.proxyPattern.dynamicProxy;

import com.design_pattern.demo.proxyPattern.interfaceProxy.IUserController;
import com.design_pattern.demo.proxyPattern.noProxy.UserController;

/**
 * @Author sandu
 * @Date 2022-03-22 21:48
 */
public class ClientDynamic {
    public static void main(String[] args) {
        MetricsCollectorProxy metricsCollectorProxy = new MetricsCollectorProxy();
        IUserController iUserController = (IUserController)metricsCollectorProxy.createProxy(new UserController());
    }
}
