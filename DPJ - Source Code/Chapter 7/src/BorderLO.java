import javax.swing.*;
import java.awt.*;

public class BorderLO extends JFrame {
    private JButton btn1, btn2, btn3, btn4, btn5;

    public static void main (String [] args) {
        BorderLO f = new BorderLO("Border Layout");
        f.setSize(420,120);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public BorderLO(String s) {
        setTitle(s);
        setLayout(new BorderLayout());

        btn1 = new JButton("Button 1 - NORTH");
        btn2 = new JButton("Button 2 - WEST");
        btn3 = new JButton("Button 3 - CENTER");
        btn4 = new JButton("Button 4 - EAST");
        btn5 = new JButton("Button 5 - SOUTH");

        add(btn1,BorderLayout.NORTH);
        add(btn2,BorderLayout.WEST);
        add(btn3,BorderLayout.CENTER);
        add(btn4,BorderLayout.EAST);
        add(btn5,BorderLayout.SOUTH);
    }
}
