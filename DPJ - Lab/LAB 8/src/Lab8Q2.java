// CHAN LIN CHEE 1191202546
// TT6V
// Lab 8 - Question 2

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Lab8Q2 extends JFrame implements ActionListener {
    private JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7;
    private JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7;
    private JButton btn;
    private JPanel p1, p2, p3;

    public static void main (String [] args) {
        Lab8Q2 f = new Lab8Q2();
        f.setSize(660,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Lab 7 - Q2");
    }

    public Lab8Q2() {
        setLayout(new BorderLayout());

        p1 = new JPanel(new GridLayout(2,4));
        p1.add(lb1 = new JLabel("Total Marks of Quizzes : "));
        p1.add(tf1 = new JTextField(10));
        p1.add(lb3 = new JLabel("Midterm Test : "));
        p1.add(tf3 = new JTextField(10));
        p1.add(lb2 = new JLabel("Total Marks of Lab : "));
        p1.add(tf2 = new JTextField(10));
        p1.add(lb4 = new JLabel("Final Exam Marks : "));
        p1.add(tf4 = new JTextField(10));

        p2 = new JPanel(new GridBagLayout());
        p2.add(btn = new JButton("Calculate"));

        p3 = new JPanel(new GridLayout(3,2));
        p3.add(lb5 = new JLabel("Coursework (50%)"));
        p3.add(tf5 = new JTextField());
        tf5.setEditable(false);
        p3.add(lb6 = new JLabel("Final (50%)"));
        p3.add(tf6 = new JTextField());
        tf6.setEditable(false);
        p3.add(lb7 = new JLabel("Result (100%)"));
        p3.add(tf7 = new JTextField());
        tf7.setEditable(false);

        add(p1,BorderLayout.NORTH);
        add(p2,BorderLayout.CENTER);
        add(p3,BorderLayout.SOUTH);

        btn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DecimalFormat df = new DecimalFormat("0.00");
        double quiz = Double.parseDouble(tf1.getText());
        double midterm = Double.parseDouble(tf3.getText());
        double lab = Double.parseDouble(tf2.getText());
        double finalExam = Double.parseDouble(tf4.getText());

        double coursework = (quiz/30*10) + (midterm/50*30) + (lab/50*10);
        double exam = (finalExam/100*50);
        double result = coursework + exam;

        if(e.getSource() == btn){
            tf5.setText(String.valueOf(df.format(coursework)));
            tf6.setText(String.valueOf(df.format(exam)));
            tf7.setText(String.valueOf(df.format(result)));
        }
    }
}
