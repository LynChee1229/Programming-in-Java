import javax.swing.*;
import java.awt.*;

public class e6_DrawingPolyline extends JFrame {
    public static void main(String [] args) {
        e6_DrawingPolyline f = new e6_DrawingPolyline();
        f.setSize(360,290);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Drawing Polyline");
    }

    public e6_DrawingPolyline() {
        add(new DrawPolyline());
    }

    class DrawPolyline extends JPanel {
        public void paintComponent (Graphics g) {
            super.paintComponent(g);

            int[] x = {72,48,120,24,96};                // 5 index
            int[] y = {12,96,32,32,96};                 // 5 index
            g.setColor(Color.GREEN);
            g.drawPolyline(x,y,x.length);   // only can draw 5 points (not linking the starting & ending)

            // to solve it: add one more point with initial vertex
            int[] a = {192,168,240,144,216,192};        // 6 index
            int[] b = {12,96,32,32,96,12};              // 6 index
            g.setColor(Color.BLUE);
            g.drawPolyline(a,b,a.length);

            /*EXTRA*/
            // show that polygon will linking the starting & ending points
            g.setColor(Color.PINK);
            int[] q = {108,204,129,129,204};
            g.drawPolygon(x,q,x.length);                // both 5 index
        }
    }
}
