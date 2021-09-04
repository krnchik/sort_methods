package com.dataStructures.patterns.crealional.factory.oldVersion;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = Program.choice("Java");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    private static DeveloperFactory choice(String devevoper) {
        devevoper = devevoper.toUpperCase();
        return switch (devevoper) {
            case "JAVA" -> new JavaDeveloperFactory();
            case "RUBY" -> new RubyDeveloperFactory();
            default -> throw new RuntimeException("Invalid value");
        };
    }
}
