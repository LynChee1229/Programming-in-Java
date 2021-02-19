// CHAN LIN CHEE 1191202546
// TT6V
// Lab 8 - Question 3

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab8Q3 extends JFrame implements ActionListener {
    private ImageIcon img = new ImageIcon(getClass().getResource("image/football.png"));
    private JLabel label = new JLabel(img);
    private JButton leftBtn, centerBtn, rightBtn;
    private JPanel panel;

    public static void main(String [] args) {
        Lab8Q3 f = new Lab8Q3();
        f.setSize(480,240);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Left or Right");
    }

    public Lab8Q3() {
        setLayout(new BorderLayout());

        panel = new JPanel();
        panel.add(leftBtn = new JButton("LEFT"));
        panel.add(centerBtn = new JButton("CENTER"));
        panel.add(rightBtn = new JButton("RIGHT"));
        panel.setBackground(Color.green);

        add(label,BorderLayout.CENTER);
        add(panel,BorderLayout.SOUTH);

        leftBtn.addActionListener(this);
        centerBtn.addActionListener(this);
        rightBtn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == leftBtn)
            label.setHorizontalAlignment(JLabel.LEFT);
        else if(e.getSource() == centerBtn)
            label.setHorizontalAlignment(JLabel.CENTER);
        else if(e.getSource() == rightBtn)
            label.setHorizontalAlignment(JLabel.RIGHT);
    }
}
