import ru.itis.game.model.*;

public class Main {
    public static void main(String[] args) {

        int finishFieldWight = 10;
        int finishFieldHeight = 10;
        int finishX = 495;
        int finishY = 495;
        Entity[] entities = new Entity[4];
        entities[0] = new Ant(0 , 0);
        entities[1] = new Turtle(0,0);
        entities[2] = new Grasshopper(0,0);
        entities[3] = new Something(0,0);

        Game game = new Game(1000,1000,finishFieldWight,finishFieldHeight,finishX,finishY, entities);
        Entity champion = game.start();
    }
}
