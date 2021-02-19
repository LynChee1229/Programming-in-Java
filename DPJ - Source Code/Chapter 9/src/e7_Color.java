import javax.swing.*;
import java.awt.*;

public class e7_Color extends JFrame {
    private JLabel lb;
    private JButton btn;
    private JPanel pnl;

    public static void main(String [] args) {
        e7_Color f = new e7_Color();
        f.setSize(360,290);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Color class in Java");
    }

    public e7_Color() {
        setLayout(new GridLayout(2,1));

        lb = new JLabel("COLOR class in Java",JLabel.CENTER);
        lb.setOpaque(true);
        lb.setBackground(Color.ORANGE);

        btn = new JButton("Test");
        btn.setBackground(new Color(129,0,129));
        btn.setForeground(Color.WHITE);

        pnl = new JPanel();
        pnl.add(lb);
        pnl.add(btn);
        pnl.setBackground(new Color(210,0,240));

        add(pnl);
        add(new TestColor());
    }

    class TestColor extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            setBackground(Color.PINK);
            g.drawRect(138,5,85,58);
        }
    }
}
