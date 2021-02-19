import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class eg4_Button extends JFrame implements ActionListener {
    private ImageIcon icon;
    private JButton btn;
    private JLabel lb;

    public static void main(String [] args) {
        eg4_Button f = new eg4_Button();
        f.setSize(400,180);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("JButton");
    }

    public eg4_Button() {
        setLayout(new FlowLayout(FlowLayout.LEFT));

        icon = new ImageIcon("src/saveIcon.jpg");
        btn = new JButton("Save",icon);
        btn.setHorizontalTextPosition(JButton.CENTER);
        btn.setVerticalTextPosition(JButton.BOTTOM);
        lb = new JLabel();

        add(btn);
        add(lb);

        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn) {
            lb.setText("Saved!");
        }
    }
}
