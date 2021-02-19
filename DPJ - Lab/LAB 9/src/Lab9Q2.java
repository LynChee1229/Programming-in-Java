// CHAN LIN CHEE 1191202546
// TT6V
// Lab 9 - Question 2

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Lab9Q2 extends JFrame implements ItemListener {
    private JRadioButton rb1, rb2, rb3;
    private JLabel lb1;
    private JCheckBox cb1, cb2;
    private JPanel p1, p2;

    private String font = "Lucida Handwriting";

    public static void main(String [] args) {
        Lab9Q2 f = new Lab9Q2();
        f.setSize(400, 240);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Wishing you : ");
        f.setResizable(false);
    }

    public Lab9Q2() {
        setLayout(new BorderLayout());

        p1 = new JPanel(new GridLayout(3,1));
        p1.add(rb1 = new JRadioButton("GREEN"));
        p1.add(rb2 = new JRadioButton("ORANGE"));
        p1.add(rb3 = new JRadioButton("RED"));
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);     bg.add(rb2);     bg.add(rb3);

        lb1 = new JLabel("GONG XI FA CAI!!",JLabel.CENTER);
        lb1.setFont(new Font(font,Font.PLAIN,26));
        lb1.setForeground(Color.RED);

        p2 = new JPanel();
        p2.setBackground(Color.CYAN);

        p2.add(cb1 = new JCheckBox("BOLD"));
        cb1.setForeground(Color.MAGENTA);
        cb1.setBackground(Color.CYAN);

        p2.add(cb2 = new JCheckBox("ITALIC"));
        cb2.setForeground(Color.BLUE);
        cb2.setBackground(Color.CYAN);

        add(p1,BorderLayout.WEST);
        add(lb1,BorderLayout.CENTER);
        add(p2,BorderLayout.SOUTH);

        rb1.addItemListener(this);
        rb2.addItemListener(this);
        rb3.addItemListener(this);

        cb1.addItemListener(this);
        cb2.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
//        if(cb1.isSelected() && cb2.isSelected()==false)
//            lb1.setFont(new Font(font,Font.BOLD,26));
//        else if(cb1.isSelected() == false && cb2.isSelected())
//            lb1.setFont(new Font(font,Font.ITALIC,26));
//        else if(cb1.isSelected() && cb2.isSelected())
//            lb1.setFont(new Font(font,Font.BOLD | Font.ITALIC,26));
//        else
//            lb1.setFont(new Font(font,Font.PLAIN,26));

        int style = Font.PLAIN;
        if(cb1.isSelected())        style += Font.BOLD;
        if(cb2.isSelected())        style += Font.ITALIC;
        lb1.setFont(new Font(font,style,26));

        if(rb1.isSelected())            lb1.setForeground(Color.GREEN);
        else if(rb2.isSelected())        lb1.setForeground(Color.ORANGE);
        else if(rb3.isSelected())        lb1.setForeground(Color.RED);
    }
}
