import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class eg5_CheckBox1 extends JFrame implements ItemListener {
    private JCheckBox cb1, cb2, cb3;
    private JLabel lb1,lb2, lb3;

    public static void main(String [] args) {
        eg5_CheckBox1 f = new eg5_CheckBox1();
        f.setSize(400,280);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("JCheckBox");
    }

    public eg5_CheckBox1() {
        setLayout(new GridLayout(3,2));

        cb1 = new JCheckBox("Chocolate",true);
        cb2 = new JCheckBox("Vanilla");
        cb3 = new JCheckBox("Strawberry");

        add(cb1);   add(lb1 = new JLabel());
        add(cb2);   add(lb2 = new JLabel());
        add(cb3);   add(lb3 = new JLabel());

        cb1.addItemListener(this);
        cb2.addItemListener(this);
        cb3.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        if(cb1.isSelected())
            lb1.setText("You have selected 'Chocolate' ");
        else
            lb1.setText("");

        if(cb2.isSelected())
            lb2.setText("You have selected 'Vanilla' ");
        else
            lb2.setText("");

        if(cb3.isSelected())
            lb3.setText("You have selected 'Strawberry' ");
        else
            lb3.setText("");
    }
}
