package com.dataStructures.patterns.behavioral.memento;

public class Game {

    private String level;
    private int time;

    public Game() {
        this.level = "Level 1";
        this.time = 0;
    }

    public void setGame(String level, int time) {
        this.level = level;
        this.time = time;
    }

    public void loud(Save save) {
        this.level = save.getLevel();
        this.time = save.getTime();
    }

    public Save save() {
        return new Save(level, time);
    }

    @Override
    public String toString() {
        return "Game{" +
                "level='" + level + '\'' +
                ", time=" + time +
                '}';
    }
}
