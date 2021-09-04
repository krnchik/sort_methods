package com.dataStructures.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeatherStation implements Observable{

    private Map<String, Integer> weatherInfo = new HashMap<>();
    private List<Observer> subscribes = new ArrayList<>();

    public void addInfo(String city, Integer temperature) {
        weatherInfo.put(city, temperature);
        notifyObservers(city, temperature);
    }

    @Override
    public void subscribe(Observer o) {
        subscribes.add(o);
    }

    @Override
    public void unsubscribe(Observer o) {
        subscribes.remove(o);
    }

    @Override
    public void notifyObservers(String city, Integer temperature) {
        for (Observer subscribe : subscribes) {
            subscribe.handleEvent(city, temperature);
        }
    }
}
