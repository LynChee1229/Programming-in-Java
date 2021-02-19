package eg1;
import eg1.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class switchWindow1 extends JFrame implements ActionListener {
    private JLabel lb1;
    private JButton next;
    private JPanel p1;

    public static void main(String [] args) {
        switchWindow1 f = new switchWindow1();
        f.setSize(290,290);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("FIRST Window");
    }

    public switchWindow1() {
        setLayout(new BorderLayout());
//        getContentPane().setBackground(Color.PINK);

        lb1 = new JLabel("This is the FIRST window (frame).", JLabel.CENTER);
        lb1.setBackground(Color.PINK);
        lb1.setOpaque(true);

        p1 = new JPanel();
        p1.add(next = new JButton("NEXT"));

        add(lb1,BorderLayout.CENTER);
        add(p1,BorderLayout.SOUTH);

        next.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == next){
            this.setVisible(false);
            switchWindow2 nf = new switchWindow2();
            nf.setSize(290,290);
            nf.setVisible(true);
            nf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            nf.setTitle("SECOND Window");
        }
    }
}
