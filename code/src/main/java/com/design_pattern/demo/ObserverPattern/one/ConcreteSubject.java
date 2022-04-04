package com.design_pattern.demo.ObserverPattern.one;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author sandu
 * @Date 2022-04-04 16:38
 */
public class ConcreteSubject implements Subject{

    List<Observer> observerList = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers(Message message) {
        for (Observer observer : observerList) {
            observer.update(message);
        }
    }
}
