package com.design_pattern.demo.chainOfResponsibilityPattern;

import com.design_pattern.demo.chainOfResponsibilityPattern.one.Handler;

/**
 * @Author sandu
 * @Date 2022-04-12 21:11
 */
public class HandlerChain {
    private Handler head = null;
    private Handler tail = null;

    public void addHandler(Handler handler) {
        // 这一步相当于初始化传入的handler，防止其带到下个节点。避免形成环，导致若是找不到合适的处理器就停不下来
        handler.setSucessor(null);

        if (head == null) {
            head = handler;
            tail = handler;
            return;
        }

        // 这里表示单链表的next()指向操作，successor代表next(),上面if()进行head和tail的初始化工作，head和tail执行同一个节点，
        // --对于新插入的节点，先进行旧tail的next节点，再移动tail。
        // 为head节点的successor赋值为当前的handler，然后tail节点赋值为当前的handler
        // 头结点保持不变(为了给后面的handle()方法使用),将新来的节点插入到当前尾结点后面，并将尾结点设置为插入的新点
        // tail为上一个handler，设置上一个handler的successor为当前handler
        // 这里的意思是新增的（处理器B）就是当前链最后一个节点（处理器A）的继承者，即把处理器B添加到处理器A的后面。
        // --然后在处理器A的handle方法的逻辑里面判断如果处理器A存在继承者就会再调用处理器B.handle
        tail.setSucessor(handler);
        tail = handler;
    }

    public void handle() {
        if (head != null){
            head.handle();
        }
    }
}
