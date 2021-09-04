package com.dataStructures.patterns.crealional.singleton;

public class Client {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
        singleton.addLogFile("1 log");
        singleton.addLogFile("2 log");
        singleton.addLogFile("3 log");
        singleton.showLogFile();
    }
}
