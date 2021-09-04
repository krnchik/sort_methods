package com.dataStructures.patterns.structural.adapter;

public interface Database {
    void insert();
    void remove();
    void update();
    void select();
}
