package com.dataStructures.patterns.structural.proxy;

public class AnimeImageProxy implements Image{

    private String filePath;
    private Image image;

    public AnimeImageProxy(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void display() throws InterruptedException {
        if (image == null) {
            image = new AnimeImage(filePath);
        }
        image.display();
    }
}
