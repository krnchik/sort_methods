package com.dataStructures.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    private static final Map<String, Shape> shares = new HashMap<>();

    public Shape getShape(String shapeName) {
        Shape shape = shares.get(shapeName);

        if (shape == null) {
            switch (shapeName) {
                case "circle" :
                    shape = new Circle();
                    break;
                case "rectangle" :
                    shape = new Rectangle();
                    break;
            }
            shares.put(shapeName, shape);
        }
        return shape;
    }
}
