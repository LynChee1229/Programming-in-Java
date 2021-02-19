import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class eg6_CheckBox2 extends JFrame implements ItemListener {
    private ImageIcon img1, img2, img3;
    private JCheckBox cb1, cb2, cb3;
    private JLabel lb1,lb2, lb3;

    public static void main(String [] args) {
        eg6_CheckBox2 f = new eg6_CheckBox2();
        f.setSize(400,280);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("JCheckBox with ImageIcon");
    }

    public eg6_CheckBox2() {
        setLayout(new GridLayout(3,2));

        img1 = new ImageIcon(getClass().getResource("Chocolate.png"));
        img2 = new ImageIcon(getClass().getResource("Vanilla.png"));
        img3 = new ImageIcon(getClass().getResource("Strawberry.png"));

        cb1 = new JCheckBox("Chocolate",img1);
        cb2 = new JCheckBox("Vanilla",img2);
        cb3 = new JCheckBox("Strawberry",img3);

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
