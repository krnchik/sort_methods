package com.dataStructures.patterns.structural.proxy;

public class AnimeImage implements Image{

    private String filePath;

    public AnimeImage(String filePath) {
        this.filePath = filePath;
        try {
            loud();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void loud() throws InterruptedException {
        System.out.println("Загрузка картинки " + filePath);
        Thread.sleep(random(5000, 10000));
    }

    private int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    @Override
    public void display() throws InterruptedException {
        System.out.println("Вывод картинки на экран " + filePath);
        Thread.sleep(random(4000, 9000));
    }
}
