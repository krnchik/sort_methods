package com.dataStructures.patterns.structural.adapter;

public class JavaApplicationAdapter2 implements Database {
    JavaApplication app;

    public JavaApplicationAdapter2(JavaApplication app) {
        this.app = app;
    }

    @Override
    public void insert() {
        app.saveObject();
    }

    @Override
    public void remove() {
        app.deleteObject();
    }

    @Override
    public void update() {
        app.updateObject();
    }

    @Override
    public void select() {
        app.selectObject();
    }
}
