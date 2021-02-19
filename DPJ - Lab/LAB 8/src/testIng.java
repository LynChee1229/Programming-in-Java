import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class testIng extends JFrame implements ActionListener {
    private JLabel title, nameTtl, courseTtl, typeTtl, totalTtl;
    private JRadioButton type1, type2;
    private JTextField nameTf, totalTf;
    private JCheckBox course1, course2, course3, course4;
    private JButton button;
    private JPanel panel1, panel2, panel3, panel4, panelA, panelB, panelC, panelD;

    public static void main(String [] args) {
        testIng frame = new testIng();
        frame.setSize(700,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Short Courses");
    }

    public testIng() {
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
        panelB.add(courseTtl = new JLabel("Short Courses (Beginner"));

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

        panel4 = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;        c.gridy = 0;
        panel4.add(totalTtl = new JLabel("Total Amount : "),c);
        c.gridx = 0;        c.gridy = 1;    c.insets = new Insets(0,0,85,0);
        panel4.add(totalTf = new JTextField("$"),c);
        totalTf.setEditable(false);

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

        double typeFee=0, courseFee=0, total=0;
        if(type1.isSelected())          typeFee = 99;
        else if(type2.isSelected())     typeFee = 299;

        if(course1.isSelected())        courseFee += 150;
        if(course2.isSelected())        courseFee += 100;
        if(course3.isSelected())        courseFee += 80;
        if(course4.isSelected())        courseFee += 100;

        total = typeFee + courseFee;
        totalTf.setText(String.valueOf("$" + df.format(total)));
    }
}
