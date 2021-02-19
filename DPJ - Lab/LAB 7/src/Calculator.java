import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    private JLabel lb1, lb2, lb3;
    private JTextField tf1, tf2, tf3;
    private JButton b1, b2, b3, b4;
    private JPanel p1, p2;

    public static void main(String [] args){
        Calculator f = new Calculator();
        f.setSize(400,150);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Simple Calculator");
    }

    public Calculator() {
        setLayout(new BorderLayout());

        lb1 = new JLabel("Number 1");
        lb2 = new JLabel("Number 2");
        lb3 = new JLabel("Result");

        tf1 = new JTextField(3);
        tf2 = new JTextField(3);
        tf3 = new JTextField(8);
        tf3.setEditable(false);

        b1 = new JButton("Add");
        b2 = new JButton("Subtract");
        b3 = new JButton("Multiply");
        b4 = new JButton("Divide");

        p1 = new JPanel();
        p1.add(lb1);
        p1.add(tf1);
        p1.add(lb2);
        p1.add(tf2);
        p1.add(lb3);
        p1.add(tf3);

        p2 = new JPanel();
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);

        add(p1,BorderLayout.NORTH);
        add(p2,BorderLayout.CENTER);
    }

}
