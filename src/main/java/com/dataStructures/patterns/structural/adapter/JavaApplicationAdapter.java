package com.dataStructures.patterns.structural.adapter;

public class JavaApplicationAdapter extends JavaApplication implements Database {

    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void remove() {
        deleteObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        selectObject();
    }
}
