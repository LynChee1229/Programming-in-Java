import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class eg8_RadioButton2 extends JFrame implements ItemListener {
    private ImageIcon img1, img2, img3;
    private JRadioButton rb1, rb2, rb3;
    private JLabel lb1, lb2, lb3;

    public static void main(String [] args) {
        eg8_RadioButton2 f = new eg8_RadioButton2();
        f.setSize(400,280);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("JRadioButton with ImageIcon");
    }

    public eg8_RadioButton2() {
        setLayout(new GridLayout(3,2));

        img1 = new ImageIcon(getClass().getResource("Chocolate.png"));
        img2 = new ImageIcon(getClass().getResource("Vanilla.png"));
        img3 = new ImageIcon(getClass().getResource("Strawberry.png"));

        rb1 = new JRadioButton("Chocolate",img1);
        rb2 = new JRadioButton("Vanilla",img2);
        rb3 = new JRadioButton("Strawberry",img3);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);   bg.add(rb2);   bg.add(rb3);

        add(rb1);   add(lb1 = new JLabel());
        add(rb2);   add(lb2 = new JLabel());
        add(rb3);   add(lb3 = new JLabel());

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
