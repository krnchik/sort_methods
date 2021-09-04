package com.dataStructures.patterns.crealional.singleton;

public class Singleton {

    private static Singleton instance;
    private String logFile = "This is log: \n\n";

    private Singleton() {
    }

//    Для не многопоточной среды
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

//    Для многопоточной среды, но операция synchronize дорогостоющая
//    public static synchronized Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }

//    Наилучший вариант для многопоточной среды, но instance должен быть volitale.
//    public static Singleton getInstance() {
//        if (instance == null) {
//            synchronized (Singleton.class) {
//                if (instance == null)
//                    instance = new Singleton();
//            }
//        }
//        return instance;
//    }

    public void addLogFile(String value) {
        logFile = logFile.concat(value + "\n");
    }

    public void showLogFile() {
        System.out.println(logFile);
    }

}
