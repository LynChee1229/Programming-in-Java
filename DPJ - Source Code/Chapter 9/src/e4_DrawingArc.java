import javax.swing.*;
import java.awt.*;

public class e4_DrawingArc extends JFrame {
    public static void main(String [] args) {
        e4_DrawingArc f = new e4_DrawingArc();
        f.setSize(360,290);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Drawing Arc");
    }

    public e4_DrawingArc() {
        add(new DrawArc());
    }

    class DrawArc extends JPanel {
        public void paintComponent (Graphics g) {
            super.paintComponent(g);

            g.setColor(Color.MAGENTA);
            g.drawArc(12,12,85,58,0,290);

            g.setColor(Color.ORANGE);
            g.fillArc(12,85,85,58,58,248);
        }
    }
}
