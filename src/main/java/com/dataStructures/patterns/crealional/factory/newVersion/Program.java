package com.dataStructures.patterns.crealional.factory.newVersion;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Developer> developers = List.of(Developer.choice("java"), Developer.choice("ruby"));
        for (Developer developer : developers) {
            developer.writeCode();
        }
    }
}
