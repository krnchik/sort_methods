package com.dataStructures.patterns.behavioral.observer;

public class Client {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Observer console = new ConsoleObserver();
        Observer file = new FileObserver();

        weatherStation.subscribe(console);
        weatherStation.subscribe(file);

        weatherStation.addInfo("NN", 30);
        weatherStation.addInfo("Rostov", 35);
        weatherStation.addInfo("Moscow", 26);
        weatherStation.unsubscribe(file);
        weatherStation.addInfo("Vladivostok", 21);
        weatherStation.unsubscribe(console);
        weatherStation.addInfo("SpB", 19);

    }
}
