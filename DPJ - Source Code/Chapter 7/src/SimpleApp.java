import javax.swing.*;
import java.awt.*;

public class SimpleApp extends JFrame {
    private JLabel lb = new JLabel("Hi, what is your name?");
    private JTextField tf = new JTextField("Michael",15);
    private JButton btn = new JButton("Click Me!");
    private JButton btn1 = new JButton("Click !");
    private JPanel p1, p2;

    public static void main (String [] args) {
        SimpleApp f = new SimpleApp();
        f.setSize(350,150);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public SimpleApp(){
        setTitle("Greeting");
        setLayout(new FlowLayout());

        p1 = new JPanel();
        p1.add(lb);
        p1.add(tf);

        p2 = new JPanel();
        p2.add(btn);

        add(p1);
        add(p2);
    }
}
