package com.dataStructures.patterns.structural.bridge.abstraction;

import com.dataStructures.patterns.structural.bridge.implementation.Developer;

public class BankSystem extends Program{

    public BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank System ");
        developer.writeCode();
    }
}
