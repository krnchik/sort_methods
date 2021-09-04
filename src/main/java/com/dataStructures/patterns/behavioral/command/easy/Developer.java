package com.dataStructures.patterns.behavioral.command.easy;

public class Developer {

    private Command create;
    private Command read;
    private Command update;
    private Command delete;

    public Developer(Command create, Command read, Command update, Command delete) {
        this.create = create;
        this.read = read;
        this.update = update;
        this.delete = delete;
    }

    public void read() {
        read.execute();
    }

    public void create() {
        create.execute();
    }

    public void update() {
        update.execute();
    }

    public void delete() {
        delete.execute();
    }
}
