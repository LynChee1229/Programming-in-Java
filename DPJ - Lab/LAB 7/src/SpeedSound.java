// use of BUTTON GROUP

import javax.swing.*;
import java.awt.*;

public class SpeedSound extends JFrame {
    private JLabel lb1, lb2, lb3;
    private JTextField tf1, tf2;
    private JRadioButton rb1, rb2, rb3;
    private JPanel p1, p2, p3;

    public static void main(String [] args){
        SpeedSound fr = new SpeedSound();
        fr.setSize(340,150);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setTitle("To Calculate Speed of Sound");
    }

    public SpeedSound() {
        setLayout(new BorderLayout());

        lb1 = new JLabel("Enter distance (in feet) : ");
        tf1 = new JTextField();
        p1 = new JPanel(new GridLayout(1,2));
        p1.add(lb1);
        p1.add(tf1);

        lb2 = new JLabel("Medium");
        rb1 = new JRadioButton("Air");
        rb2 = new JRadioButton("Water");
        rb3 = new JRadioButton("Steel");
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);   bg.add(rb2);   bg.add(rb3);      // group the radio button
        p2 = new JPanel(new GridLayout(1,4));
        p2.add(lb2);
        p2.add(rb1);
        p2.add(rb2);
        p2.add(rb3);

        lb3 = new JLabel("Time (seconds) : ");
        tf2 = new JTextField(10);
        tf2.setEditable(false);
        p3 = new JPanel();
        p3.add(lb3);
        p3.add(tf2);

        add(p1,BorderLayout.NORTH);
        add(p2,BorderLayout.CENTER);
        add(p3,BorderLayout.SOUTH);
    }
}
