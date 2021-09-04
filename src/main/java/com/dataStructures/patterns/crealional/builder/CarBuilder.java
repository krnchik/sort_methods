package com.dataStructures.patterns.crealional.builder;

public abstract class CarBuilder {

    Car car;

    public void create(){
        car = new Car();
    }

    abstract void buildTransmission();
    abstract void buildCarBody();
    abstract void buildMark();
    abstract void buildSeatCount();
    abstract void buildMaxSpeed();
    abstract void buildGpsMode();

    public Car getCar() {
        return car;
    }
}
