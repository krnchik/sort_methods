package com.dataStructures.patterns.behavioral.iterator;

import java.util.Locale;

public interface Developer extends Iterable{
    void writeCode();
    String getName();
    static Developer getDeveloper(String developer, String name, String[] skills) {
        developer = developer.toLowerCase(Locale.ROOT);
        return switch (developer) {
            case "java" -> new JavaDeveloper(name, skills);
            case "php" -> new PhpDeveloper(name, skills);
            default -> throw new IllegalArgumentException("Invalid value");
        };
    }
}
