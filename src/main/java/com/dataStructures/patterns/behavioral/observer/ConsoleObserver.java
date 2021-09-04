package com.dataStructures.patterns.behavioral.observer;

public class ConsoleObserver implements Observer{

    @Override
    public void handleEvent(String city, int temp) {
        System.out.println("Температура в городе " + city +" ровно " + temp);
    }
}
