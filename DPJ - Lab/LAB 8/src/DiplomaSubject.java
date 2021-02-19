import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DiplomaSubject extends JFrame implements ActionListener {
    private JComboBox subject;
    private JLabel label1, result;
    private JPanel panel1, panel2;
    private String[] sub = {"PROGRAMMING IN JAVA","DATABASE SYSTEMS","MATH 1"};

    public static void main (String [] args) {
        DiplomaSubject f = new DiplomaSubject();
        f.setSize(300,125);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Diploma Subjects");
    }

    public DiplomaSubject() {
        setLayout(new BorderLayout());

        panel1 = new JPanel();
        panel1.add(label1 = new JLabel("Subject Code : "));
        panel1.add(subject = new JComboBox(new Object[] {"DPJ5018","DCS5078","DIM5058"}));

        panel2 = new JPanel();
        panel2.add(result = new JLabel("Subject?"));
        result.setFont(new Font("Verdana",Font.BOLD,14));       // Chapter 9

        add(panel1,BorderLayout.NORTH);
        add(panel2,BorderLayout.SOUTH);

        subject.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == subject) {
            int index = subject.getSelectedIndex();
            result.setText(sub[index]);
        }

//        String selected = "";
//        if(e.getSource() == subject) {
//            int code = subject.getSelectedIndex();
//            switch (code){
//                case 0 :    selected = "PROGRAMMING IN JAVA";   break;
//                case 1 :    selected = "DATABASE SYSTEMS";      break;
//                case 2 :    selected = "MATH 1";                break;
//            }
//            result.setText(selected);
//        }
    }
}
