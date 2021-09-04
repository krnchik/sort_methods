package com.dataStructures.patterns.structural.composite.leaf;

import com.dataStructures.patterns.structural.composite.Product;

public class Strawberry implements Product {

    private int price;

    public Strawberry(int price) {
        this.price = price;
    }

    @Override
    public void buyProduct() {
        System.out.println("Strawberry sold for " + price);
    }
}
