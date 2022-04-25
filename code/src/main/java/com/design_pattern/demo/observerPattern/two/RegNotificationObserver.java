package com.design_pattern.demo.observerPattern.two;

/**
 * @Author sandu
 * @Date 2022-04-04 17:10
 */
public class RegNotificationObserver implements RegObserver{
    private NotificationService notificationService;
    @Override
    public void handleRegSuccess(long userId) {
        notificationService.sendInboxMessage(userId,"Welcome...");
        System.out.println("Welcome");
    }
}
