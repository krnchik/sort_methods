package com.dataStructures.patterns.behavioral.observer;

public interface Observable {
    void subscribe(Observer o);
    void unsubscribe(Observer o);
    void notifyObservers(String city, Integer temperature);
}
