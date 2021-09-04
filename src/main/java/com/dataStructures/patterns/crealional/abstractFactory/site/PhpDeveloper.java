package com.dataStructures.patterns.crealional.abstractFactory.site;

import com.dataStructures.patterns.crealional.abstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Write Php code...");
    }
}
