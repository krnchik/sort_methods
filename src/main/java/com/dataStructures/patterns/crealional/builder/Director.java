package com.dataStructures.patterns.crealional.builder;

public class Director {

    private CarBuilder builder;

    public Car buildCar() {
        builder.create();
        builder.buildMark();
        builder.buildSeatCount();
        builder.buildCarBody();
        builder.buildTransmission();
        builder.buildMaxSpeed();
        builder.buildGpsMode();
        Car car = builder.getCar();
        return car;
    }

    public void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }
}
