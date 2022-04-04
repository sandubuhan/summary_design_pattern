package com.design_pattern.demo.ObserverPattern.two;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author sandu
 * @Date 2022-04-04 17:11
 */
public class UserController {
    private UserService userService;
    private List<RegObserver> regObservers = new ArrayList<>();

    public void setRegObservers(List<RegObserver> observers){
        regObservers.addAll(observers);
    }

    public Long register(String telephone,String password){
        long userId = userService.register(telephone, password);
        for (RegObserver regObserver : regObservers) {
            regObserver.handleRegSuccess(userId);
        }
        return userId;
    }
}
