import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChangeFontStyle extends JFrame implements ItemListener {
    private JLabel lb;
    private JCheckBox cb1, cb2;
    private JPanel pnl;

    public static void main (String [] args) {
        ChangeFontStyle f = new ChangeFontStyle();
        f.setSize(320,240);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Wishing you...");
    }

    public ChangeFontStyle() {
        setLayout(new BorderLayout());

        lb = new JLabel("GONG XI FA CAI!!", JLabel.CENTER);
        lb.setFont(new Font("Lucida Handwriting",Font.PLAIN,26));
        lb.setForeground(Color.RED);

        pnl = new JPanel();
        pnl.add(cb1 = new JCheckBox("BOLD"));
        cb1.setBackground(Color.CYAN);
        cb1.setForeground(Color.MAGENTA);

        pnl.add(cb2 = new JCheckBox("ITALIC"));
        cb2.setBackground(Color.CYAN);
        cb2.setForeground(Color.BLUE);
        pnl.setBackground(Color.CYAN);

        add(lb, BorderLayout.CENTER);
        add(pnl, BorderLayout.SOUTH);

        cb1.addItemListener(this);
        cb2.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        int style = Font.PLAIN;
        if(cb1.isSelected())        style += Font.BOLD;
        if(cb2.isSelected())        style += Font.ITALIC;

        lb.setFont(new Font("Lucida Handwriting",style,26));
    }
}
