import jdk.nashorn.internal.scripts.JD;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class eg12_Dialog extends JFrame implements ActionListener {
    private JPanel p1;
    private JButton btn1, btn2;
    private JDialog dialog;
    private static eg12_Dialog f = new eg12_Dialog();

    public static void main(String [] args) {
//        eg12_Dialog f = new eg12_Dialog();
        f.setSize(400,280);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("JDialog");
    }

    public eg12_Dialog() {
        setLayout(new BorderLayout());
        p1 = new JPanel();
        p1.add(btn1 = new JButton("Click Me!!"));
        add(p1);
        btn1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn1) {
//            JOptionPane.showMessageDialog(f,"This is a dialog box","JDialog",JOptionPane.PLAIN_MESSAGE);
            dialogG();
        }
        if(e.getSource() == btn2){
            dialog.setVisible(false);
        }
    }

    public void dialogG( ){
        dialog = new JDialog(f,"Dialog Box",Dialog.ModalityType.APPLICATION_MODAL);
        dialog.setSize(200,120);
        dialog.setLayout(new BorderLayout());
        dialog.setTitle("Dialog Box");

        JPanel p2 = new JPanel();
        btn2 = new JButton("OK!!");
        p2.add(btn2);
        dialog.add(p2, BorderLayout.CENTER);
        btn2.addActionListener(this);

        dialog.setVisible(true);
    }
}
