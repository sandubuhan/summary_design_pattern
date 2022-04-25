package com.design_pattern.demo.observerPattern.eventBus;

import com.google.common.eventbus.EventBus;

/**
 * @Author sandu
 * @Date 2022-04-05 10:23
 */
public class Demo {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus("Test");
        // 注册监听者
        eventBus.register(new OrderEventListener());
        // 发布消息
        eventBus.post(new OrderMessage());
    }
}
