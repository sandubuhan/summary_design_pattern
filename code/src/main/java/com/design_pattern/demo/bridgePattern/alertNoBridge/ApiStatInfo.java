package com.design_pattern.demo.bridgePattern.alertNoBridge;

import lombok.Data;

/**
 * @Author sandu
 * @Date 2022-03-23 22:18
 */
@Data
public class ApiStatInfo {
    private long api;

    private long requestCount;
    private long errorCount;
    private long durationOfSeconds;


}
