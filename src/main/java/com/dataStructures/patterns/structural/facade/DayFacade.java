package com.dataStructures.patterns.structural.facade;

public class DayFacade {

    private Morning morning = new Morning();
    private Afternoon afternoon = new Afternoon();
    private Evening evening = new Evening();

    public void liveDay() {
        morning.wakeUp();
        morning.goBath();
        morning.eat();
        morning.leaveHome();
        afternoon.work();
        afternoon.eat();
        afternoon.goShop();
        evening.eat();
        evening.sleep();
    }
}
