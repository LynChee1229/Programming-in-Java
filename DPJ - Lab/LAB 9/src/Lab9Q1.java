// CHAN LIN CHEE 1191202546
// TT6V
// Lab 9 - Question 1

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab9Q1 extends JFrame implements ActionListener {
    private JButton btn1, btn2, btn3, btn4, btn5, btn6;
    private JPanel panel;

    private static int choice;

    public static void main (String [] args) {
        Lab9Q1 frame = new Lab9Q1();
        frame.setSize(850,360);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Lab9Q1 - Buttons & Shapes");
    }

    public Lab9Q1( ) {
        setLayout(new BorderLayout());

        panel = new JPanel();
        panel.add(btn1 = new JButton("Show Rectangle"));
        panel.add(btn2 = new JButton("Show Oval"));
        panel.add(btn3 = new JButton("Show Arc"));
        panel.add(btn4 = new JButton("Show Polygon"));
        panel.add(btn5 = new JButton("Show Car"));
        panel.add(btn6 = new JButton("Show Snowman"));

        add(new DisplayShape(), BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn1)           choice = 1;
        else if(e.getSource() == btn2)      choice = 2;
        else if(e.getSource() == btn3)      choice = 3;
        else if(e.getSource() == btn4)      choice = 4;
        else if(e.getSource() == btn5)      choice = 5;
        else if(e.getSource() == btn6)      choice = 6;

        repaint();      // clear the surface and to call the paint method
    }

    // class which is a panel to draw graphics
    class DisplayShape extends JPanel {

        // method to display graphics
        public void paintComponent(Graphics g) {
            super.paintComponent(g);        //ensure the component is properly displayed

            if(choice == 1){
                g.setColor(Color.GREEN);
                g.fillRect(29,80,240,120);
            }
            else if(choice == 2){
                g.setColor(Color.RED);
                g.fillOval(145,80,240,120);
            }
            else if(choice == 3){
                g.setColor(Color.ORANGE);
                g.fillArc(272,50,190,190,0,290);
            }
            else if(choice == 4){
                int[] x = {400,500,560,560,500,400,340,340};
                int[] y = {60,60,120,180,240,240,180,120};
                g.setColor(Color.BLUE);
                g.fillPolygon(x,y,x.length);
            }
            else if(choice == 5){
                g.setColor(Color.ORANGE);
                int[] x = {530,630,630,660,660,500,500,530};
                int[] y = {100,100,130,130,180,180,130,130};
                g.fillPolygon(x,y,x.length);
                g.setColor(Color.GRAY);
                g.fillRect(475,155,25,15);
                g.setColor(Color.CYAN);
                g.fillArc(515,103,110,55,0,90);
                g.fillArc(535,103,55,55,90,90);
                g.setColor(Color.BLACK);
                g.fillArc(520,160,35,35,0,360);
                g.fillArc(615,160,35,35,0,360);
                g.setColor(new Color(224,224,224));
                g.fillArc(460,152,15,15,0,360);
                g.fillArc(455,157,20,15,0,360);
                g.fillArc(438,150,15,15,0,360);
                g.fillArc(435,155,20,15,0,360);
            }
            else if(choice == 6){
                g.setColor(Color.WHITE);
                g.fillArc(610,120,140,120,0,360);
                g.setColor(new Color(204,0,0));
                g.fillArc(650,118,63,15,0,-180);
                g.fillArc(690,85,25,85,-45,24);
                g.fillArc(690,85,25,85,-8,29);
                g.setColor(Color.WHITE);
                g.fillArc(640,65,85,63,0,360);
                g.setColor(Color.BLACK);
                g.fillArc(666,85,6,6,0,360);
                g.fillArc(690,85,6,6,0,360);
                g.fillArc(674,145,10,10,0,360);
                g.fillArc(672,169,13,13,0,360);
                g.fillArc(670,195,17,17,0,360);
                g.setColor(Color.ORANGE);
                int[] x = {623,677,677};
                int[] y = {110,102,112};
                g.fillPolygon(x,y,x.length);
            }
        }
    }
}
