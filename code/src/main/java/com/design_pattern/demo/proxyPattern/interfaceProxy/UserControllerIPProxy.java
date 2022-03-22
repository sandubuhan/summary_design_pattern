package com.design_pattern.demo.proxyPattern.interfaceProxy;

import com.design_pattern.demo.proxyPattern.MetricsCollector;
import com.design_pattern.demo.proxyPattern.RequestInfo;
import com.design_pattern.demo.proxyPattern.UserVo;

/**
 * @Author sandu
 * @Date 2022-03-22 21:10
 */
public class UserControllerIPProxy implements IUserController {

    private MetricsCollector metricsCollector;
    private UserControllerIP userControllerIP;


    public UserControllerIPProxy(MetricsCollector metricsCollector, UserControllerIP userControllerIP) {
        this.metricsCollector = metricsCollector;
        this.userControllerIP = userControllerIP;
    }

    @Override
    public UserVo login(String telephone, String password) {
        long startTimestamp = System.currentTimeMillis();

        // 委托
        UserVo userVo = userControllerIP.login(telephone, password);

        long        endTimeStamp = System.currentTimeMillis();
        long        responseTime = endTimeStamp - startTimestamp;
        RequestInfo requestInfo  = new RequestInfo("login", responseTime, startTimestamp);
        metricsCollector.recordRequest(requestInfo);

        return userVo;
    }

    @Override
    public UserVo register(String telephone, String password) {
        long startTimestamp = System.currentTimeMillis();

        UserVo userVo = userControllerIP.register(telephone, password);

        long        endTimeStamp = System.currentTimeMillis();
        long        responseTime = endTimeStamp - startTimestamp;
        RequestInfo requestInfo  = new RequestInfo("register", responseTime, startTimestamp);
        metricsCollector.recordRequest(requestInfo);

        return userVo;
    }
}
