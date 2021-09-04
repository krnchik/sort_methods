package com.dataStructures.patterns.crealional.factory.newVersion;


public interface Developer {
    void writeCode();

    static Developer choice(String devevoper) {
        devevoper = devevoper.toUpperCase();
        switch (devevoper) {
            case "JAVA": return new JavaDeveloper();
            case "RUBY": return new RubyDeveloper();
            default: throw new RuntimeException("Invalid value");
        }
    }
}
