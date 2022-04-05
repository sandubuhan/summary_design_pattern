package com.design_pattern.demo.ObserverPattern.eventBus;

import com.google.common.eventbus.Subscribe;

/**
 * 监听者类，不过在这个类里面需要确定我们需要处理哪些消息（可以是多个），每个消息的处理对应一个函数
 * 而且这个函数需要添加 注解
 *
 * @Author sandu
 * @Date 2022-04-05 10:21
 */
public class OrderEventListener {

    @Subscribe
    public void dealWithEvent(OrderMessage event){
        System.out.println("我收到了"+ event.getOrderContent());
    }
}
