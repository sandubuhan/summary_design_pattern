package com.design_pattern.demo.bridgePattern.alertNoBridge;

import com.design_pattern.demo.bridgePattern.NotificationEmergencyLevel;

/**
 * @Author sandu
 * @Date 2022-03-23 22:13
 */
public class ErrorAlertHandler extends AlertHandler {
    public ErrorAlertHandler(AlertRule rule, Notification notification) {
        super(rule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        if (apiStatInfo.getErrorCount() > rule.getMatchedRule(apiStatInfo.getApi())) {
            notification.notify(NotificationEmergencyLevel.SEVERE, "...");
        }
    }
}
