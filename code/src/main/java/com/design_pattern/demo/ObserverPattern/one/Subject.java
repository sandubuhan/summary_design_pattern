package com.design_pattern.demo.ObserverPattern.one;




/**
 * @Author sandu
 * @Date 2022-04-04 16:35
 */
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(Message message);
}
