import javax.swing.*;
import java.awt.*;

public class GraphicsShape extends JFrame {
    public static void main(String [] args) {
        GraphicsShape f = new GraphicsShape();
        f.setSize(520,420);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Drawing");
    }

    public GraphicsShape() {
        add(new DisplayShape());
    }

    class DisplayShape extends JPanel{
        public void paintComponent(Graphics g) {

            //call the superclass's methods to ensure the component is properly displayed
            super.paintComponent(g);

            g.setColor(Color.RED);
            g.drawLine(8,30,380,30);

            g.setColor(Color.BLUE);
            g.drawRect(8,42,85,58);
            g.fillRect(100,42,85,58);

            g.setColor(Color.YELLOW);
            g.drawOval(8,112,85,58);
            g.fillOval(100,112,85,58);

            g.setColor(Color.GREEN);
            g.fillArc(8,182,85,58,90,270);
            g.drawArc(100,182,85,85,0,120);

            g.setColor(Color.ORANGE);
            int[] x = {200,229,300};
            int[] y = {182,258,229};
            g.fillPolygon(x,y,x.length);

            int[] a = {300,360,366};
            int[] b = {182,272,242};
            g.drawPolyline(a,b,a.length);

            g.setColor(Color.PINK);
            g.setFont(new Font("Arial",Font.BOLD,30));
            g.drawString("JAVA",50,285);
        }
    }
}
