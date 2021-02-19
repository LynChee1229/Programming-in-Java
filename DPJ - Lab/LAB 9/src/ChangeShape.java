import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeShape extends JFrame implements ActionListener {
    private JButton btn1, btn2, btn3, btn4;
    private JPanel pnl;

    private static int choice;  // put as int

    public static void main (String [] args) {
        ChangeShape f = new ChangeShape();
        f.setSize(580,290);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Buttons & Shapes");
    }

    public ChangeShape() {
        setLayout(new BorderLayout());

        pnl = new JPanel();
        pnl.add(btn1 = new JButton("Show Rectangle"));
        pnl.add(btn2 = new JButton("Show Oval"));
        pnl.add(btn3 = new JButton("Show Arc"));
        pnl.add(btn4 = new JButton("Show Polygon"));

        add(new getShape(), BorderLayout.CENTER);       //call the constructor of panel
        add(pnl, BorderLayout.SOUTH);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn1)           choice = 1;
        else if(e.getSource() == btn2)      choice = 2;
        else if(e.getSource() == btn3)      choice = 3;
        else if(e.getSource() == btn4)      choice = 4;

        repaint();      // clear the surface and to call the paint method
    }

    // class which is a panel to draw graphics
    class getShape extends JPanel {

        // method to display graphics
        public void paintComponent(Graphics g) {
            super.paintComponent(g);    //ensure the component is properly displayed

            int[] x = {200,225,275,300,300,275,225,200};
            int[] y = {80,50,50,80,100,130,130,100};

            switch (choice) {
                case 1 :    g.setColor(Color.GREEN);
                            g.fillRect(210,58,240,85);
                            break;
                case 2 :    g.setColor(Color.RED);
                            g.drawOval(210,58,240,85);
                            break;
                case 3 :    g.setColor(Color.ORANGE);
                            g.fillArc(210,58,85,85,0,280);
                            break;
                case 4 :    g.setColor(Color.BLUE);
                            g.drawPolygon(x,y,x.length);
                            break;
            }
        }
    }
}
