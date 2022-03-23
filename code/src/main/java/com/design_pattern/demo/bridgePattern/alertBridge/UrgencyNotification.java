package com.design_pattern.demo.bridgePattern.alertBridge;

/**
 * @Author sandu
 * @Date 2022-03-23 22:28
 */
public class UrgencyNotification extends Notification{

    public UrgencyNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {

    }
}
