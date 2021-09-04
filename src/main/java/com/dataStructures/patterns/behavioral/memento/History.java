package com.dataStructures.patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class History {

    private final List<Save> saves = new ArrayList<>();


    public Save getSave(int number) {
        if (saves.size() >= number)
            return saves.get(number - 1);
        else
            throw new IllegalArgumentException("Нет такого сохранения");
    }

    public void addSave(Save save) {
        saves.add(save);
    }
}
