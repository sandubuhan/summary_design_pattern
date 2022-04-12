package com.design_pattern.demo.chainOfResponsibilityPattern.three;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author sandu
 * @Date 2022-04-12 21:52
 */
public class HandlerChain {
    private List<IHandler> handlers = new ArrayList<>();

    public void addHandler(IHandler iHandler){
        handlers.add(iHandler);
    }

    public void handle(){
        for (IHandler handler : handlers) {
            boolean handle = handler.handle();
            if (handle){
                break;
            }
        }
    }
}
