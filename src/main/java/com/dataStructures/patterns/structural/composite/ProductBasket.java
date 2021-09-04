package com.dataStructures.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class ProductBasket implements Product{
    private List<Product> list = new ArrayList<>();

    public void addComponent(Product product) {
        list.add(product);
    }

    public void removeComponent(Product product) {
        list.remove(product);
    }

    @Override
    public void buyProduct() {
        for (Product product : list) {
            product.buyProduct();
        }
    }
}
