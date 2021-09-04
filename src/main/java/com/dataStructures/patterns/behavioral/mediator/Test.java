package com.dataStructures.patterns.behavioral.mediator;

public class Test {
    public static void main(String[] args) {
        Chat chat = new SchoolChat();

        User admin = new Admin(chat, "Мария Ивановна");
        User user1 = new SimpleUser(chat, "Ron");
        User user2 = new SimpleUser(chat, "Ben");
        User user3 = new SimpleUser(chat, "Tom");

        chat.setAdmin(admin);
        chat.addUser(user1);
        chat.addUser(user2);
        chat.addUser(user3);

        admin.sendMessage("Hello class!!!");
        System.out.println();
        user1.sendMessage("Всем Привет");
    }
}
