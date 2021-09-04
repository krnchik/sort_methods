package com.dataStructures.patterns.behavioral.mediator;

//Mediator
public interface Chat {
    void sendMessage(String massage, User user);
    void addUser(User user);
    void setAdmin(User user);
}
