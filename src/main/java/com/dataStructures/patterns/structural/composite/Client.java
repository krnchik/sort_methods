package com.dataStructures.patterns.structural.composite;

import com.dataStructures.patterns.structural.composite.leaf.Cake;
import com.dataStructures.patterns.structural.composite.leaf.Egg;
import com.dataStructures.patterns.structural.composite.leaf.Strawberry;

public class Client {
    public static void main(String[] args) {
        Product egg = new Egg(100);
        Product cake = new Cake(500);
        Product strawberry = new Strawberry(1000);

        Product egg1 = new Egg(80);
        Product cake1 = new Cake(10200);

        Product cake2 = new Cake(200);
        Product strawberry2 = new Strawberry(15000);

        ProductBasket productBasket1 = new ProductBasket();
        ProductBasket productBasket2 = new ProductBasket();
        ProductBasket productBasketMain = new ProductBasket();

        productBasket1.addComponent(egg1);
        productBasket1.addComponent(cake1);

        productBasket2.addComponent(cake2);
        productBasket2.addComponent(strawberry2);

        productBasketMain.addComponent(egg);
        productBasketMain.addComponent(cake);
        productBasketMain.addComponent(strawberry);
        productBasketMain.addComponent(productBasket1);
        productBasketMain.addComponent(productBasket2);

        productBasketMain.buyProduct();

    }
}
