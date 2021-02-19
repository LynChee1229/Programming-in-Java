// JLabel with icon

import javax.swing.*;
import java.awt.*;

public class eg1_Label extends JFrame {
    private JLabel label1, label2;
    private ImageIcon icon;

    public static void main(String [] args) {
        eg1_Label f = new eg1_Label();
        f.setSize(400,120);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setTitle("JLabel");
    }

    public eg1_Label() {
        setLayout(new BorderLayout());

        label1  = new JLabel("Programming in Java.",JLabel.CENTER);

        icon = new ImageIcon("src/email.png");
        label2 = new JLabel("Your email : ",icon,JLabel.LEFT);

        add(label1,BorderLayout.NORTH);
        add(label2,BorderLayout.SOUTH);
    }
}
