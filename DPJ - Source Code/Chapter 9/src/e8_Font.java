import javax.swing.*;
import java.awt.*;

public class e8_Font extends JFrame {
    private JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7;

    public static void main (String [] args) {
        e8_Font f = new e8_Font();
        f.setSize(480,290);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("FONT class in Java");
    }

    public e8_Font() {
        setLayout(new GridLayout(7,1));

        add(lb1 = new JLabel("Arial",JLabel.CENTER));
        lb1.setFont(new Font("Arial",Font.PLAIN,24));
        lb1.setForeground(Color.RED);

        add(lb2 = new JLabel("Verdana",JLabel.CENTER));
        lb2.setFont(new Font("Verdana",Font.PLAIN,24));
        lb2.setForeground(Color.ORANGE);

        add(lb3 = new JLabel("Times New Roman",JLabel.CENTER));
        lb3.setFont(new Font("Times New Roman",Font.PLAIN,24));
        lb3.setForeground(new Color(190,190,0));

        add(lb4 = new JLabel("Serif",JLabel.CENTER));
        lb4.setFont(new Font("Serif",Font.PLAIN,24));
        lb4.setForeground(new Color(0,190,80));

        add(lb5 = new JLabel("Sans Serif",JLabel.CENTER));
        lb5.setFont(new Font("Sans Serif",Font.PLAIN,24));
        lb5.setForeground(new Color(0,120,210));

        add(lb6 = new JLabel("Helvetica",JLabel.CENTER));
        lb6.setFont(new Font("Helvetica",Font.PLAIN,24));
        lb6.setForeground(Color.MAGENTA);

        add(lb7 = new JLabel("Monospaced",JLabel.CENTER));
        lb7.setFont(new Font("Monospaced",Font.PLAIN,24));
        lb7.setForeground(new Color(120,0,210));


    }
}
