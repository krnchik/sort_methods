package com.dataStructures.patterns.behavioral.mediator;

public class SimpleUser extends User{

    public SimpleUser(Chat chat, String name) {
        super(chat, name);
    }

    @Override
    public void getMessage(String message, User sender) {
        System.out.println("User " + getName() + " get message: " +
                message + " from " + sender.getName());
    }
}
