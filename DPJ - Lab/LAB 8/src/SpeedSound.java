import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.DecimalFormat;

public class SpeedSound extends JFrame implements ItemListener {
    private JLabel lb1, lb2, lb3;
    private JTextField tf1, tf2;
    private JRadioButton rb1, rb2, rb3;
    private JPanel p1, p2, p3;

    public static void main(String [] args){
        SpeedSound fr = new SpeedSound();
        fr.setSize(360,150);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setTitle("To Calculate Speed of Sound");
    }

    public SpeedSound() {
        setLayout(new BorderLayout());

        p1 = new JPanel(new GridLayout(1,2));
        p1.add(lb1 = new JLabel("Enter distance (in feet) : "));
        p1.add(tf1 = new JTextField());

        p2 = new JPanel(new GridLayout(1,4));
        p2.add(lb2 = new JLabel("Medium"));
        p2.add(rb1 = new JRadioButton("Air"));
        p2.add(rb2 = new JRadioButton("Water"));
        p2.add(rb3 = new JRadioButton("Steel"));
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);   bg.add(rb2);   bg.add(rb3);

        p3 = new JPanel();
        p3.add(lb3 = new JLabel("Time (seconds) : "));
        p3.add(tf2 = new JTextField(10));       tf2.setEditable(false);

        add(p1,BorderLayout.NORTH);
        add(p2,BorderLayout.CENTER);
        add(p3,BorderLayout.SOUTH);

        rb1.addItemListener(this);
        rb2.addItemListener(this);
        rb3.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        DecimalFormat df = new DecimalFormat("0.00");

        double distance = Double.parseDouble(tf1.getText());
        double time = 0;

        if(rb1.isSelected())        time = distance/1100;
        else if(rb2.isSelected())   time = distance/4900;
        else if(rb3.isSelected())   time = distance/16400;

        tf2.setText(String.valueOf(df.format(time)));
    }
}
