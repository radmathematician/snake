import javax.swing.*;

public class Renderer {
    private Window mainFrame;
    private Canvas canvas;

    public Renderer(int width, int height){
        mainFrame = new Window("Snake", width, height);
        canvas = new Canvas();
    }

    public void start(){
        mainFrame.start();
        mainFrame.addPanel(canvas);
    }

    public void render(World world){

    }

    public void finish(){

    }
}