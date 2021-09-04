package com.dataStructures.patterns.structural.flyweight;

public class Circle implements Shape {

    private final int RADIUS = 5;

    @Override
    public void draw(int x, int y) {
        System.out.println("Нарисован круг x: " + x + " y: " + y + " радиус " + RADIUS);
    }
}
