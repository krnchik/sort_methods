package com.dataStructures.patterns.structural.adapter;

public class Client {
    public static void main(String[] args) {
        // Реализация адаптера с помощью наследования
        Database database = new JavaApplicationAdapter();

        database.insert();
        database.remove();
        database.select();
        database.update();

        System.out.println("==============================================");
        // Реализация адаптера с помощью композиции
        JavaApplication app = new JavaApplication();
        Database database1 = new JavaApplicationAdapter2(app);
        database1.insert();
        database1.remove();
        database1.select();
        database1.update();
    }

}
