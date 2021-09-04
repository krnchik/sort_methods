package com.dataStructures.patterns.behavioral.observer;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileObserver implements Observer{

    File file = new File("weather.txt");
    private static boolean isRepeat = false;


    @Override
    public void handleEvent(String city, int temp) {
        String info = "Температура в городе " + city +" ровно " + temp + "\r\n";
        try{
            FileWriter writer = new FileWriter(file.getAbsolutePath(), isRepeat);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(info);
            bufferWriter.close();
            isRepeat = true;
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
