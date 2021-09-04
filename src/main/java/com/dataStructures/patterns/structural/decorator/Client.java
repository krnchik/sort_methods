package com.dataStructures.patterns.structural.decorator;

import javax.crypto.Cipher;

//SmF2YSDQvdC1INGC0L7RgNC80L7Qt9C40YIhCg==
public class Client {
    public static void main(String[] args) {

        DataSource message = new Message();
        message.writeData("SmF2YSDQvdC1INGC0L7RgNC80L7Qt9C40YIhCg==");
        System.out.println(message.readData());

        DataSource encrypted =new EncryptionDecorator(message);
        encrypted.writeData(encrypted.readData());
        System.out.println(encrypted.readData());

        DataSource decrypted = new DecryptionDecorator(new Message());
        decrypted.writeData(encrypted.readData());
        System.out.println(decrypted.readData());

    }
}
