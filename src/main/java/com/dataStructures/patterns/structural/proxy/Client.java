package com.dataStructures.patterns.structural.proxy;

public class Client {
    public static void main(String[] args) throws InterruptedException {

        long currentTime = System.currentTimeMillis();
        Image image = new AnimeImageProxy("C:\\Users\\Карен Георгиевич\\akeno.jpg");
        image.display();
        System.out.println(System.currentTimeMillis() - currentTime);
    }
}
