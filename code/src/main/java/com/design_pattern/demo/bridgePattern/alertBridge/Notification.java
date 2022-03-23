package com.design_pattern.demo.bridgePattern.alertBridge;

/**
 * @Author sandu
 * @Date 2022-03-23 22:27
 */
public abstract class Notification {
    protected MsgSender msgSender;

    public Notification(MsgSender msgSender) {
        this.msgSender = msgSender;
    }

    public abstract void notify(String message);
}
