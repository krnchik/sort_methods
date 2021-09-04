package com.dataStructures.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SchoolChat implements Chat {

    User admin;
    Set<User> users = new HashSet<>();

    public void setAdmin(User user) {
        if (admin instanceof Admin) {
            throw new IllegalArgumentException("not admin");
        } else {
            admin = user;
        }
    }

    public void addUser(User user) {
        if (user instanceof SimpleUser && !users.add(user)) {
            throw new IllegalArgumentException("not simple user");
        }
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : users) {
            if (!user.equals(u)) {
                u.getMessage(message, user);
            }
        }
        if (!(user instanceof Admin)) {
            admin.getMessage(message, user);
        }
    }
}
