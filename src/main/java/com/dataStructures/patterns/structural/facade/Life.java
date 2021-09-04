package com.dataStructures.patterns.structural.facade;

public class Life {
    public static void main(String[] args) throws InterruptedException {
        DayFacade day = new DayFacade();
        while (true) {
            day.liveDay();
            Thread.sleep(5000);
        }
    }


}
