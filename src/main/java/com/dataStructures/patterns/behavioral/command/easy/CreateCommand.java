package com.dataStructures.patterns.behavioral.command.easy;

public class CreateCommand implements Command{

    Database database;

    public CreateCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.create();
    }
}
