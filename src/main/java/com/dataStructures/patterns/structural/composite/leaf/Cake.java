package com.dataStructures.patterns.structural.composite.leaf;

import com.dataStructures.patterns.structural.composite.Product;

public class Cake implements Product {

    private int price;

    public Cake(int price) {
        this.price = price;
    }

    @Override
    public void buyProduct() {
        System.out.println("Cake sold for " + price);
    }
}
