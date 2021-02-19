import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class eg9_ComboBox_Action extends JFrame implements ActionListener {
    private JComboBox coffee;
    private JLabel lb;
    private JTextField tf;

    public static void main(String [] args) {
        eg9_ComboBox_Action f = new eg9_ComboBox_Action();
        f.setSize(400,280);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("JComboBox - ActionListener");
    }

    public eg9_ComboBox_Action() {
        setLayout(new FlowLayout(FlowLayout.LEFT));

//        Method1: use String[]
        String[] choice = {"Cappuccino", "Espresso", "Mocha"};
        coffee = new JComboBox(choice);

        add(coffee);
        add(lb = new JLabel("You selected : "));
        add(tf = new JTextField(10));
        tf.setEditable(false);

        coffee.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String item = (String) coffee.getSelectedItem();
        tf.setText(item);
    }
}
