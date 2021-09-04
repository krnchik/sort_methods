package com.dataStructures.patterns.crealional.builder;

public class RenoMeganBuilder extends CarBuilder{
    @Override
    void buildTransmission() {
        car.setTransmission(Car.Transmission.ROBOT);
    }

    @Override
    void buildCarBody() {
        car.setCarBody(Car.CarBody.COUPE);
    }

    @Override
    void buildMark() {
        car.setMark("Reno");
    }

    @Override
    void buildSeatCount() {
        car.setSeatCount(2);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(330);
    }

    @Override
    void buildGpsMode() {
        car.setGpsMode(true);
    }
}
