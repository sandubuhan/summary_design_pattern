package com.design_pattern.demo.proxyPattern.abstractProxy;

import com.design_pattern.demo.proxyPattern.MetricsCollector;
import com.design_pattern.demo.proxyPattern.RequestInfo;
import com.design_pattern.demo.proxyPattern.UserVo;

/**
 * @Author sandu
 * @Date 2022-03-22 21:17
 */
public class UserControllerAbProxy extends UserControllerAb {
    private MetricsCollector metricsCollector;

    public UserControllerAbProxy(MetricsCollector metricsCollector) {
        this.metricsCollector = metricsCollector;
    }

    @Override
    public UserVo login(String telephone, String password) {
        long        startTimestamp = System.currentTimeMillis();
        UserVo      userVo         = super.login(telephone, password);
        long        endTimeStamp   = System.currentTimeMillis();
        long        responseTime   = endTimeStamp - startTimestamp;
        RequestInfo requestInfo    = new RequestInfo("login", responseTime, startTimestamp);
        metricsCollector.recordRequest(requestInfo);

        return userVo;
    }

    @Override
    public UserVo register(String telephone, String password) {
        long        startTimestamp = System.currentTimeMillis();
        UserVo      userVo         = super.register(telephone, password);
        long        endTimeStamp   = System.currentTimeMillis();
        long        responseTime   = endTimeStamp - startTimestamp;
        RequestInfo requestInfo    = new RequestInfo("login", responseTime, startTimestamp);
        metricsCollector.recordRequest(requestInfo);

        return userVo;
    }
}
