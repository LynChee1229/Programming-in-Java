import javax.swing.*;
import java.awt.*;

public class e5_DrawingPolygon extends JFrame {
    public static void main(String [] args) {
        e5_DrawingPolygon f = new e5_DrawingPolygon();
        f.setSize(360,290);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Drawing Polygon");
    }

    public e5_DrawingPolygon() {
        add(new DrawPolygon());
    }

    class DrawPolygon extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Method 1
            int[] x = {12,24,85,92,58};
            int[] y = {36,85,85,36,12};
            g.setColor(Color.PINK);
            g.drawPolygon(x,y,x.length);

            // Method 1
            int[] a = {112,124,185,192,158};
            int[] b = {36,85,85,36,12};
            g.setColor(Color.ORANGE);
            g.fillPolygon(a,b,a.length);

            // Method 2
            Polygon p = new Polygon();
            g.setColor(Color.GREEN);
            p.addPoint(24,141);
            p.addPoint(48,170);
            p.addPoint(96,170);
            p.addPoint(120,141);
            p.addPoint(72,112);
            g.drawPolygon(p);

            // Method 2
            Polygon q = new Polygon();
            g.setColor(Color.BLUE);
            q.addPoint(129,136);
            q.addPoint(153,160);
            q.addPoint(201,160);
            q.addPoint(225,136);
            q.addPoint(177,112);
            g.fillPolygon(q);
        }
    }
}
