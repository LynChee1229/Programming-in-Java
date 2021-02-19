import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class eg7_RadioButton1 extends JFrame implements ItemListener {
    private JRadioButton rb1, rb2, rb3;
    private JLabel lb1, lb2, lb3;

    public static void main (String [] args) {
        eg7_RadioButton1 f = new eg7_RadioButton1();
        f.setSize(400,280);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("JRadioButton");
    }

    public eg7_RadioButton1() {
        setLayout(new GridLayout(3,2));

        add(rb1 = new JRadioButton("Chocolate"));
        add(lb1 = new JLabel());

        add(rb2 = new JRadioButton("Vanilla",true));
        add(lb2 = new JLabel());

        add(rb3 = new JRadioButton("Strawberry"));
        add(lb3 = new JLabel());

        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);

        rb1.addItemListener(this);
        rb2.addItemListener(this);
        rb3.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        if(rb1.isSelected())
            lb1.setText("You have selected 'Chocolate' ");
        else
            lb1.setText("");

        if(rb2.isSelected())
            lb2.setText("You have selected 'Vanilla' ");
        else
            lb2.setText("");

        if(rb3.isSelected())
            lb3.setText("You have selected 'Strawberry' ");
        else
            lb3.setText("");
    }
}
