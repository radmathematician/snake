import java.util.LinkedList;
import java.util.List;

public class Snake {
    private List<Entity> body;

    public Snake(){
        body = new LinkedList<>();
        body.add(new Entity());
    }
}
