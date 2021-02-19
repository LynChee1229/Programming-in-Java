import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    private JLabel lb1, lb2, lb3;
    private JTextField tf1, tf2, tf3;
    private JButton b1, b2, b3, b4;
    private JPanel p1, p2;

    public static void main(String [] args){
        Calculator f = new Calculator();
        f.setSize(550,150);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Simple Calculator");
    }

    public Calculator() {
        setLayout(new BorderLayout());

        p1 = new JPanel();
        p1.add(lb1 = new JLabel("Number 1"));
        p1.add(tf1 = new JTextField(3));
        p1.add(lb2 = new JLabel("Number 2"));
        p1.add(tf2 = new JTextField(3));
        p1.add(lb3 = new JLabel("Result"));
        p1.add(tf3 = new JTextField(20));       tf3.setEditable(false);

        p2 = new JPanel();
        p2.add(b1 = new JButton("Add"));
        p2.add(b2 = new JButton("Subtract"));
        p2.add(b3 = new JButton("Multiply"));
        p2.add(b4 = new JButton("Divide"));

        add(p1,BorderLayout.NORTH);
        add(p2,BorderLayout.CENTER);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(tf1.getText());
        double num2 = Double.parseDouble(tf2.getText());
        double total = 0;

        try{
            if(e.getSource() == b1)         total = num1 + num2;
            else if(e.getSource() == b2)    total = num1 - num2;
            else if(e.getSource() == b3)    total = num1 * num2;
            else if(e.getSource() == b4){
                if(num2 == 0)   throw new ArithmeticException();
                total = num1 / num2;
            }
            tf3.setText(String.valueOf(total));
        }
        catch (ArithmeticException exc){
            tf3.setText("Denominator CANNOT be ZERO");
        }
    }
}
