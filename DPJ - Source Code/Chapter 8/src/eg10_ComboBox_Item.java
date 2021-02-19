import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class eg10_ComboBox_Item extends JFrame implements ItemListener {
    private JComboBox coffee;
    private JLabel lb;
    private JTextField tf;

    public static void main(String [] args) {
        eg10_ComboBox_Item f = new eg10_ComboBox_Item();
        f.setSize(400,280);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("JComboBox - ItemListener");
    }

    public eg10_ComboBox_Item() {
        setLayout(new FlowLayout(FlowLayout.LEFT));

//        Method2 : use object[]
        coffee = new JComboBox(new Object[] {"Cappuccino", "Espresso", "Mocha"});

        add(coffee);
        add(lb = new JLabel("You selected : "));

//        add default choice if use itemListener
        add(tf = new JTextField("Cappuccino",10));
        tf.setEditable(false);

        coffee.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        if(e.getStateChange() == ItemEvent.SELECTED) {
            String item = (String) coffee.getSelectedItem();
            tf.setText(item);
        }
    }
}
