package com.design_pattern.demo.ObserverPattern.eventBus;

/**
 * 消息类，通常会封装成一个类，消息不同类也不同。如果是带参数的消息，这些参数就可以作为类的属性
 *
 * @Author sandu
 * @Date 2022-04-05 10:11
 */
public class OrderMessage {

    private String orderContent;

    public String getOrderContent() {
        return orderContent;
    }

    public void setOrderContent(String orderContent) {
        this.orderContent = orderContent;
    }
}
