import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeImage extends JFrame implements ActionListener {
    // array objects of ImageIcon
    // to use .getResource, they must inside src.
    private ImageIcon[] icon = {
            new ImageIcon(getClass().getResource("image/elephant.png")),
            new ImageIcon(getClass().getResource("image/monkey.png")),
            new ImageIcon(getClass().getResource("image/butterfly.png"))};
    private JLabel lb;
    private JButton b1, b2, b3;
    private JPanel p1, p2;

    public static void main(String [] args){
        ChangeImage f = new ChangeImage();
        f.setSize(430,360);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Buttons and Icons");
    }

    public ChangeImage() {
        setLayout(new BorderLayout());

/*        [Second method for array objects of ImageIcon]    */
//        icon = new ImageIcon[3];
//        icon[0] = new ImageIcon("src/image/elephant.png");
//        icon[1] = new ImageIcon("src/image/monkey.png");
//        icon[2] = new ImageIcon("src/image/butterfly.png");

        //RESIZE ImageIcon
        Image img = icon[0].getImage();
        Image rs = img.getScaledInstance(290,290,Image.SCALE_SMOOTH);
        icon[0] = new ImageIcon(rs);
        img = icon[1].getImage();
        rs = img.getScaledInstance(210,240,Image.SCALE_SMOOTH);
        icon[1] = new ImageIcon(rs);
        img = icon[2].getImage();
        rs = img.getScaledInstance(240,246,Image.SCALE_SMOOTH);
        icon[2] = new ImageIcon(rs);

        lb = new JLabel(icon[0]);
        p1 = new JPanel();
        p1.add(lb);

        p2 = new JPanel();
        p2.add(b1 = new JButton("Elephant"));
        p2.add(b2 = new JButton("Monkey"));
        p2.add(b3 = new JButton("Butterfly"));

        add(p1,BorderLayout.CENTER);
        add(p2,BorderLayout.SOUTH);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1)             lb.setIcon(icon[0]);
        else if(e.getSource() == b2)        lb.setIcon(icon[1]);
        else if(e.getSource() == b3)        lb.setIcon(icon[2]);
    }
}
