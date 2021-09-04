package com.dataStructures.patterns.structural.composite.leaf;

import com.dataStructures.patterns.structural.composite.Product;

public class Egg implements Product {

    private int price;

    public Egg(int price) {
        this.price = price;
    }

    @Override
    public void buyProduct() {
        System.out.println("Egg sold for " + price);
    }
}
