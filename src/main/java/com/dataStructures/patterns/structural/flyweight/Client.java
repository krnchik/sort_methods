package com.dataStructures.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        ShapeFactory shape = new ShapeFactory();

        List<Shape> list = new ArrayList<>();
        list.add(shape.getShape("circle"));
        list.add(shape.getShape("circle"));
        list.add(shape.getShape("circle"));
        list.add(shape.getShape("circle"));
        list.add(shape.getShape("circle"));
        list.add(shape.getShape("circle"));
        list.add(shape.getShape("circle"));
        list.add(shape.getShape("circle"));
        list.add(shape.getShape("circle"));
        list.add(shape.getShape("circle"));
        list.add(shape.getShape("circle"));
        list.add(shape.getShape("circle"));
        list.add(shape.getShape("rectangle"));
        list.add(shape.getShape("rectangle"));
        list.add(shape.getShape("rectangle"));
        list.add(shape.getShape("rectangle"));
        list.add(shape.getShape("rectangle"));
        list.add(shape.getShape("rectangle"));
        list.add(shape.getShape("rectangle"));
        list.add(shape.getShape("rectangle"));
        list.add(shape.getShape("rectangle"));

        int x = 0;
        int y = 0;
        for (Shape s : list) {
            s.draw(x++, y++);
            System.out.println(s.hashCode());
        }
    }
}
