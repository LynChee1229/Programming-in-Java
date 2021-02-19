import javax.swing.*;
import java.awt.*;

public class e2_DrawingRectangle extends JFrame {
    public static void main(String [] args) {
        e2_DrawingRectangle f = new e2_DrawingRectangle();
        f.setSize(290,240);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Drawing Rectangle");
    }

    public e2_DrawingRectangle() {
        add(new DrawRectangle());
    }

    class DrawRectangle extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.setColor(Color.BLUE);
            g.drawRect(29,29,85,58);

            g.setColor(Color.ORANGE);
            g.fillRect(29,66,85,58);    // will cover above the no fill rect
        }
    }
}
