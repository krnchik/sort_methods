package com.dataStructures.patterns.crealional.abstractFactory.bank;

import com.dataStructures.patterns.crealional.abstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Write Java code...");
    }
}
