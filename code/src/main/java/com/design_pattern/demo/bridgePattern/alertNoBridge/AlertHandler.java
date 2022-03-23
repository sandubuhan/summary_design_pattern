package com.design_pattern.demo.bridgePattern.alertNoBridge;

/**
 * @Author sandu
 * @Date 2022-03-23 22:13
 */
public abstract class AlertHandler {
    protected AlertRule rule;
    protected Notification notification;

    public AlertHandler(AlertRule rule, Notification notification) {
        this.rule = rule;
        this.notification = notification;
    }

    public abstract void check(ApiStatInfo apiStatInfo);
}
