import javax.swing.*;
import java.awt.*;

public class e3_DrawingOval extends JFrame {
    public static void main(String [] args) {
        e3_DrawingOval f = new e3_DrawingOval();
        f.setSize(360,290);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Drawing Oval");
    }

    public e3_DrawingOval() {
        add(new DrawOval());
    }

    class DrawOval extends JPanel {
        public void paintComponent(Graphics g){
            super.paintComponent(g);

            g.setColor(Color.MAGENTA);
            g.drawOval(12,12,85,58);

            g.setColor(Color.PINK);
            g.fillOval(12,85,85,58);
        }
    }
}
