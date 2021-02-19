// CHAN LIN CHEE 1191202546
// TT6V
// Lab 8 - Question 4

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Lab8Q4 extends JFrame implements ActionListener {
    private JLabel title, nameTtl, courseTtl, typeTtl, totalTtl;
    private JRadioButton type1, type2;
    private JTextField nameTf, totalTf;
    private JCheckBox course1, course2, course3, course4;
    private JButton button;
    private JPanel panel1, panel2, panel3, panel4, panelA, panelB, panelC, panelD, panelE;

    public static void main(String [] args) {
        Lab8Q4 frame = new Lab8Q4();
        frame.setSize(700,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Short Courses");
    }

    public Lab8Q4() {
        setLayout(new BorderLayout());

        panel1 = new JPanel();
        panel1.add(title = new JLabel("Welcome to XO Short Courses Application"));
        title.setFont(new Font("Verdana",Font.BOLD,15));

        panel2 = new JPanel(new GridLayout(3,1));
        panel2.add(typeTtl = new JLabel("Registration Type : "));
        panel2.add(type1 = new JRadioButton("Student"));
        panel2.add(type2 = new JRadioButton("Employed"));
        ButtonGroup bg = new ButtonGroup();
        bg.add(type1);      bg.add(type2);

        panelA = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelA.add(nameTtl = new JLabel("Name : "));
        panelA.add(nameTf = new JTextField(29));

        panelB = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelB.add(courseTtl = new JLabel("Short Courses (Beginner) : "));

        panelC = new JPanel(new GridLayout(2,2));
        panelC.add(course1 = new JCheckBox("Facebook - RM 150"));
        panelC.add(course2 = new JCheckBox("Twitter - RM 100"));
        panelC.add(course3 = new JCheckBox("Email - RM 80"));
        panelC.add(course4 = new JCheckBox("FourSquare - RM 100"));

        panelD = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelD.add(button = new JButton("Calculate"));

        panel3 = new JPanel(new GridLayout(4,1));
        panel3.add(panelA);
        panel3.add(panelB);
        panel3.add(panelC);
        panel3.add(panelD);

        panelE = new JPanel(new GridLayout(2,1));
        panelE.setPreferredSize(new Dimension(110,58));
        panelE.add(totalTtl = new JLabel("Total Amount : "));
        panelE.add(totalTf = new JTextField("$"));
        totalTf.setEditable(false);

        panel4 = new JPanel(new BorderLayout());
        panel4.add(panelE,BorderLayout.NORTH);

        panel2.setBorder(BorderFactory.createDashedBorder(Color.GRAY));
        panel4.setBorder(BorderFactory.createDashedBorder(Color.GRAY));

        add(panel1,BorderLayout.NORTH);
        add(panel2,BorderLayout.WEST);
        add(panel3,BorderLayout.CENTER);
        add(panel4,BorderLayout.EAST);

        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DecimalFormat df = new DecimalFormat("0.00");

        double typeFee=0, courseFee=0, totalFee=0;
        if(type1.isSelected())          typeFee = 99;
        else if(type2.isSelected())     typeFee = 299;

        if(course1.isSelected())        courseFee += 150;
        if(course2.isSelected())        courseFee += 100;
        if(course3.isSelected())        courseFee += 80;
        if(course4.isSelected())        courseFee += 100;

        totalFee = typeFee + courseFee;
        totalTf.setText(String.valueOf("$" + df.format(totalFee)));
    }
}
