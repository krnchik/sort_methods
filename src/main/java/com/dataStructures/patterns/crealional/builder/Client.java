package com.dataStructures.patterns.crealional.builder;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new LadaNivaBuilder());
        Car car = director.buildCar();
        System.out.println(car);
    }
}
