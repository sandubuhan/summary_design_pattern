package com.design_pattern.demo.ObserverPattern.two;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;

import java.util.List;
import java.util.concurrent.Executors;

/**
 * 利用 EventBus 框架实现的观察者模式，跟从零开始编写的观察者模式相比，从大的流程上来说，实现思路大致一样，
 * 都需要定义 Observer，并且通过 register() 函数注册 Observer，
 * 也都需要通过调用某个函数（比如，EventBus 中的 post() 函数）来给 Observer 发送消息（在 EventBus 中消息被称作事件 event）。
 *
 * @Author sandu
 * @Date 2022-04-05 9:52
 */
public class UserControllerTwo {
    private UserService userService;

    private EventBus eventBus;
    private static final int DEFAULT_EVENTBUS_THREAD_POOL_SIZE = 20;

    public UserControllerTwo() {
        eventBus = new AsyncEventBus(Executors.newFixedThreadPool(DEFAULT_EVENTBUS_THREAD_POOL_SIZE));
    }

    public void setRegObservers(List<Object> observers) {
        for (Object observer : observers) {
            eventBus.register(observer);
        }
    }

    public Long register(String telephone,String password){
        long register = userService.register(telephone, password);
        eventBus.post(register);
        return register;
    }
}
