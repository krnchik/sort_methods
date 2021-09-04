package com.dataStructures.patterns.structural.bridge;

import com.dataStructures.patterns.structural.bridge.abstraction.BankSystem;
import com.dataStructures.patterns.structural.bridge.abstraction.Program;
import com.dataStructures.patterns.structural.bridge.abstraction.StockExchange;
import com.dataStructures.patterns.structural.bridge.implementation.CppDeveloper;
import com.dataStructures.patterns.structural.bridge.implementation.JavaDeveloper;

public class Client {
    public static void main(String[] args) {
        Program[] programs = {new StockExchange(new JavaDeveloper()),
                new StockExchange(new CppDeveloper()),
                new BankSystem(new JavaDeveloper()),
                new BankSystem(new CppDeveloper()),};
        for (Program program : programs) {
            program.developProgram();
        }
    }
}
