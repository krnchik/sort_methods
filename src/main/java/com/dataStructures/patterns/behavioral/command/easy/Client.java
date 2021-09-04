package com.dataStructures.patterns.behavioral.command.easy;

public class Client {
    public static void main(String[] args) {
        Database database = new Database();
        Developer developer = new Developer(new CreateCommand(database),
                new ReadCommand(database),
                new UpdateCommand(database),
                new DeleteCommand(database));
        developer.delete();
        developer.create();
        developer.read();
        developer.update();
    }
}
