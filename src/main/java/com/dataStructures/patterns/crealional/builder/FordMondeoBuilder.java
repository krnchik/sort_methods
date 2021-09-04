package com.dataStructures.patterns.crealional.builder;

public class FordMondeoBuilder extends CarBuilder{
    @Override
    void buildTransmission() {
        car.setTransmission(Car.Transmission.AUTO);
    }

    @Override
    void buildCarBody() {
        car.setCarBody(Car.CarBody.SEDAN);
    }

    @Override
    void buildMark() {
        car.setMark("Ford");
    }

    @Override
    void buildSeatCount() {
        car.setSeatCount(5);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(150);
    }

    @Override
    void buildGpsMode() {
        car.setGpsMode(true);
    }
}
