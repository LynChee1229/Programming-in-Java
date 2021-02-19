import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class eg2_TextField extends JFrame implements ActionListener {
    private JLabel lb1, lb2, output;
    private JTextField tf1, tf2;
    private ImageIcon icon;
    private JPanel p1, p2;

    public static void main(String [] args) {
        eg2_TextField f = new eg2_TextField();
        f.setSize(400,150);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("JTextField");
    }

    public eg2_TextField() {
        setLayout(new BorderLayout());

        p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p1.add(lb1 = new JLabel("Hi, what is your name? "));
        p1.add(tf1 = new JTextField(15));

        p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        icon = new ImageIcon("src/email.png");
        p2.add(lb2 = new JLabel("Your email : ",icon,JLabel.LEFT));
        p2.add(tf2 = new JTextField("@email",15));
        tf2.setHorizontalAlignment(JTextField.RIGHT);

        output = new JLabel();
        output.setHorizontalAlignment(SwingConstants.CENTER);

        add(p1,BorderLayout.NORTH);
        add(p2,BorderLayout.CENTER);
        add(output,BorderLayout.SOUTH);

        tf2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tf2) {
            String name = tf1.getText();
            String email = tf2.getText();
            output.setText("Hello " + name + ", your email is : " + email);
        }
    }
}
