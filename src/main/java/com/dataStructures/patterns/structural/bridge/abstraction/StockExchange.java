package com.dataStructures.patterns.structural.bridge.abstraction;

import com.dataStructures.patterns.structural.bridge.implementation.Developer;

public class StockExchange extends Program{

    public StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock Exchange");
        developer.writeCode();
    }
}
