package com.dataStructures.patterns.behavioral.mediator;

public class Admin extends User{

    public Admin(Chat chat, String name) {
        super(chat, name);
    }

    @Override
    void getMessage(String message, User sender) {
        System.out.println("Admin " + getName() + " get message: " +
                message + " from " + sender.getName());
    }
}
