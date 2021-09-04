package com.dataStructures.patterns.structural.decorator;

public class Message implements DataSource {

    private String data;

    public Message() {
    }

    @Override
    public void writeData(String data) {
        this.data = data;
    }

    @Override
    public String readData() {
        return data;
    }
}
