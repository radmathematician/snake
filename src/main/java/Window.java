import javax.swing.*;

public class Window  extends JFrame {
    private int width;
    private int height;

    public Window(String title, int width, int height){
        super(title);

        this.width = width;
        this.height = height;
    }

    public void start(){
        this.setSize(width, height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void addPanel(JPanel panel){
        this.add(panel);
    }
}
