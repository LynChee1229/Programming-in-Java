import javax.swing.*;
import java.awt.*;

public class GridLO extends JFrame {
    private JButton b1, b2, b3, b4, b5, b6;

    public static void main(String [] args){
        GridLO f = new GridLO();
        f.setSize(420,180);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public GridLO() {
        setTitle("Grid Layout 2x3");
        setLayout(new GridLayout(2,3));

        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");
        b4 = new JButton("Button 4");
        b5 = new JButton("Button 5");
        b6 = new JButton("Button 6");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
    }
}
