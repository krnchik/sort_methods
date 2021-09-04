package com.dataStructures.patterns.behavioral.state.easy;

public class Client {
    public static void main(String[] args) {
        Radio radio = new Radio();

        radio.setStation(new Radio7());

        for (int i = 0; i < 10; i++) {
            radio.changeStation();
            radio.play();
        }
    }
}
