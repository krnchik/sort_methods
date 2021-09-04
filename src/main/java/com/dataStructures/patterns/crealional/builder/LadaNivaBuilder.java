package com.dataStructures.patterns.crealional.builder;

public class LadaNivaBuilder extends CarBuilder{

    @Override
    void buildTransmission() {
        car.setTransmission(Car.Transmission.MANUAL);
    }

    @Override
    void buildCarBody() {
        car.setCarBody(Car.CarBody.SUV);
    }

    @Override
    void buildMark() {
        car.setMark("Lada");
    }

    @Override
    void buildSeatCount() {
        car.setSeatCount(5);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(100);
    }

    @Override
    void buildGpsMode() {
        car.setGpsMode(false);
    }
}
