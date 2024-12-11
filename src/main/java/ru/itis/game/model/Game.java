package ru.itis.game.model;

public class Game {
    private int fieldWidth;
    private int fieldHeigth;
    private int finishFieldWight;
    private int finishFieldHeight;
    private int finishX;
    private int finishY;
    private Entity[] players;

    public Game() {
    }

    public Game(int fieldWidth, int fieldHeigth, int finishFieldHeight, int finishFieldWight, int finishX, int finishY, Entity[] players) {
        this.fieldWidth = fieldWidth;
        this.fieldHeigth = fieldHeigth;
        this.finishFieldHeight = finishFieldHeight;
        this.finishFieldWight = finishFieldWight;
        this.finishX = finishX;
        this.finishY = finishY;
        this.players = players;
    }

    public Entity start() {
        while (true) {
            for (int i = 0; i < players.length; i++) {
                players[i].move();
            }
            for (int i = 0; i < players.length; i++) {
                if (players[i].x >= finishX
                        && players[i].getX() <= finishX + finishFieldWight
                        && players[i].getY() >= finishY && players[i].getY() <= finishY + finishFieldHeight) {
                    System.out.println(players[i]);
                    return players[i];
                }
            }
        }
    }
}
