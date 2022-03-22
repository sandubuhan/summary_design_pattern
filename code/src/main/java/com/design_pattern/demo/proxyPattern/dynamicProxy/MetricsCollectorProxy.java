package com.design_pattern.demo.proxyPattern.dynamicProxy;

import com.design_pattern.demo.proxyPattern.MetricsCollector;
import com.design_pattern.demo.proxyPattern.RequestInfo;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;

/**
 * @Author sandu
 * @Date 2022-03-22 21:32
 */
public class MetricsCollectorProxy {
    private MetricsCollector metricsCollector;

    public MetricsCollectorProxy() {
        this.metricsCollector = new MetricsCollector();
    }

    public Object createProxy(Object proxiedObject){
        Class<?>[] interfaces = proxiedObject.getClass().getInterfaces();
        DynamicProxyHandler dynamicProxyHandler = new DynamicProxyHandler(proxiedObject);
        return Proxy.newProxyInstance(proxiedObject.getClass().getClassLoader(),interfaces,dynamicProxyHandler);
    }

    private class DynamicProxyHandler implements InvocationHandler {

        private Object proxiedObject;

        public DynamicProxyHandler(Object proxiedObject) {
            this.proxiedObject = proxiedObject;
        }

        @Override
        public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
            long startTimestamp = System.currentTimeMillis();
            Object result = method.invoke(proxiedObject, objects);
            long endTimeStamp = System.currentTimeMillis();
            long responseTime = endTimeStamp - startTimestamp;
            String apiName = proxiedObject.getClass().getName() + ":" + method.getName();
            RequestInfo requestInfo = new RequestInfo(apiName, responseTime, startTimestamp);
            metricsCollector.recordRequest(requestInfo);
            return result;
        }
    }
}
