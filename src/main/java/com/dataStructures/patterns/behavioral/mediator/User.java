package com.dataStructures.patterns.behavioral.mediator;

public abstract class User {

    Chat chat;
    String name;

    public User(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    abstract void getMessage(String message, User sender);

    public String getName() {
        return name;
    }
}
