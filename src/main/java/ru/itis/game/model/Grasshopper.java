package ru.itis.game.model;

public class Grasshopper extends Entity {
    public Grasshopper() {
    }


    public Grasshopper(int x, int y) {
        super("Кузнечик", x, y);
    }

    @Override
    public void move() {
        int direction = (int) (Math.random() * 4);
        switch (direction) {
            case 0:
                if (y + 2 <= fieldHeigth) {
                    y += 2;
                }
                break;
            case 1:
                if (x < fieldWidth) {
                    ++x;
                }
                break;
            case 2:
                if (x > 0) {
                    --x;
                }
                break;
        }
    }
}