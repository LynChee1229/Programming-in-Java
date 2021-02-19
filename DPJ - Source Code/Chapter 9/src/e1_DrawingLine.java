import javax.swing.*;
import java.awt.*;

public class e1_DrawingLine extends JFrame {
    public static void main(String [] args) {
        e1_DrawingLine f = new e1_DrawingLine();
        f.setSize(290,240);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Drawing Line");
    }

    public e1_DrawingLine() {
        add(new DrawingBoard());
    }

    class DrawingBoard extends JPanel {
        public void paintComponent (Graphics g) {
            super.paintComponent(g);

            g.drawLine(12,12,58,12);    // horizontal straight line
            g.drawLine(12,24,58,38);    // decrease line
            g.drawLine(12,58,12,85);    // vertical straight line
        }
    }
}
