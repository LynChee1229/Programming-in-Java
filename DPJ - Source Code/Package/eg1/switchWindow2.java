package eg1;
import eg1.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class switchWindow2 extends JFrame implements ActionListener {
    private JLabel lb1;
    private JButton previous;
    private JPanel p1;

    public static void main(String [] args) {
        switchWindow2 f = new switchWindow2();
        f.setSize(290,290);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("SECOND Window");
    }

    public switchWindow2() {
        setLayout(new BorderLayout());
//        getContentPane().setBackground(Color.ORANGE);

        lb1 = new JLabel("This is the SECOND window (frame).", JLabel.CENTER);
        lb1.setBackground(Color.ORANGE);
        lb1.setOpaque(true);

        p1 = new JPanel();
        p1.add(previous = new JButton("PREVIOUS"));

        add(lb1,BorderLayout.CENTER);
        add(p1,BorderLayout.SOUTH);

        previous.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == previous){
            this.setVisible(false);
            switchWindow1 pf = new switchWindow1();
            pf.setSize(290,290);
            pf.setVisible(true);
            pf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            pf.setTitle("FIRST Window");
        }
    }
}
