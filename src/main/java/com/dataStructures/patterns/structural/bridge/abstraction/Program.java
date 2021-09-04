package com.dataStructures.patterns.structural.bridge.abstraction;

import com.dataStructures.patterns.structural.bridge.implementation.Developer;

public abstract class Program {
    Developer developer;

    public Program(Developer developer) {
        this.developer = developer;
    }

    public abstract void developProgram();
}
