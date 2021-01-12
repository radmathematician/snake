import java.util.LinkedList;
import java.util.List;

public class World {
    private static World worldInstance = null;

    private Snake snake;
    private Entity food;
    private int widthInTiles;
    private int heightInTiles;

    private World(){
        snake = new Snake();
        food = null;
    }

    public static World getInstance(){
        if (worldInstance == null){
            worldInstance = new World();
        }

        return worldInstance;
    }

    public Snake getSnake(){
        return snake;
    }

    public Entity getFood() {
        return food;
    }

    public int getWidthInTiles() {
        return widthInTiles;
    }

    public int getHeightInTiles() {
        return heightInTiles;
    }
}
