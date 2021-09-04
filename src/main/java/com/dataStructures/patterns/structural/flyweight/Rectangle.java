package com.dataStructures.patterns.structural.flyweight;

public class Rectangle implements Shape {

    private static final int LENGTH = 10;
    private static final int WIDTH = 5;

    @Override
    public void draw(int x, int y) {
        System.out.println("Нарисован прямоугольник x: " + x + " y: " + y + " длина " + LENGTH
                + " ширина " + WIDTH);
    }
}
