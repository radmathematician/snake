import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Canvas extends JPanel {
    public Canvas(){

    }

//    @Override
//    public void paint(Graphics g) {
//        Graphics2D graphic2d = (Graphics2D) g;
//        graphic2d.setColor(Color.BLUE);
//        graphic2d.fillRect(100, 50, 60, 80);
//    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("This is my custom panel!", 10, 20);
    }
}
