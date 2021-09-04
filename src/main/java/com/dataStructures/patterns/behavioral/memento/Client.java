package com.dataStructures.patterns.behavioral.memento;

public class Client {
    public static void main(String[] args) {
        Game game = new Game();
        History history = new History();

        history.addSave(game.save());
        System.out.println(game.toString());

        game.setGame("Level 5", 30);
        history.addSave(game.save());
        System.out.println(game.toString());

        game.setGame("Level 30", 500);
        history.addSave(game.save());
        System.out.println(game.toString());

        game.loud(history.getSave(2));
        System.out.println(game.toString());

    }
}
