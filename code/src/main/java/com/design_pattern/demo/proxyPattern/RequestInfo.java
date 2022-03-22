package com.design_pattern.demo.proxyPattern;

import lombok.Data;

/**
 * @Author sandu
 * @Date 2022-03-22 21:06
 */
@Data
public class RequestInfo {

    String login;
    long responseTime;
    long startTimestamp;

    public RequestInfo(String login, long responseTime, long startTimestamp) {
        this.login = login;
        this.responseTime = responseTime;
        this.startTimestamp = startTimestamp;
    }
}
