import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class eg11_List extends JFrame implements ListSelectionListener {
    private JList jl1, jl2, jl3;
    private JLabel ttl1, ttl2, ttl3, lb1, lb2, lb3;
    private JTextField tf1, tf2, tf3;
    private JPanel pA, pB, pC, p1, p2, p3, panel1, panel2, panel3;

    public static void main(String [] args) {
        eg11_List f = new eg11_List();
        f.setSize(720,420);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("JList");
        f.setResizable(false);
    }

    public eg11_List() {
        setLayout(new BorderLayout());

        jl1 = new JList(new Object[] {"Program Design", "Object Oriented Programming", "JAVA", "Internet & Web Publishing"});
        jl2 = new JList(new Object[] {"Chocolate", "Vanilla", "Strawberry"});
        jl3 = new JList(new Object[] {"Blue", "Purple", "Red", "Yellow", "Green"});
        jl1.setFixedCellWidth(240);
        jl2.setFixedCellWidth(240);
        jl3.setFixedCellWidth(240);
        jl1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jl2.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jl3.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        ttl1 = new JLabel("SINGLE_SELECTION");              ttl1.setBorder(BorderFactory.createEmptyBorder(0,0,5,0));
        ttl2 = new JLabel("SINGLE_INTERVAL_SELECTION");     ttl2.setBorder(BorderFactory.createEmptyBorder(0,0,5,0));
        ttl3 = new JLabel("MULTIPLE_INTERVAL_SELECTION");   ttl3.setBorder(BorderFactory.createEmptyBorder(0,0,5,0));

        lb1 = new JLabel("You selected : ");
        lb2 = new JLabel("You selected : ");
        lb3 = new JLabel("You selected : ");
        tf1 = new JTextField(24);           tf1.setEditable(false);
        tf2 = new JTextField(24);           tf2.setEditable(false);
        tf3 = new JTextField(24);            tf3.setEditable(false);

        pA = new JPanel(new BorderLayout());
        pA.add(ttl1,BorderLayout.NORTH);   pA.add(jl1,BorderLayout.CENTER);
        pA.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
        pB = new JPanel(new BorderLayout());
        pB.add(ttl2,BorderLayout.NORTH);   pB.add(jl2,BorderLayout.CENTER);
        pB.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
        pC = new JPanel(new BorderLayout());
        pC.add(ttl3,BorderLayout.NORTH);   pC.add(jl3,BorderLayout.CENTER);
        pC.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));

        p1 = new JPanel(new GridBagLayout());
        p1.add(lb1);    p1.add(tf1);
        p2 = new JPanel(new GridBagLayout());
        p2.add(lb2);    p2.add(tf2);
        p3 = new JPanel(new GridBagLayout());
        p3.add(lb3);    p3.add(tf3);

        panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel1.add(pA);     panel1.add(p1);
        panel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel2.add(pB);     panel2.add(p2);
        panel3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel3.add(pC);     panel3.add(p3);

        add(panel1,BorderLayout.NORTH);
        add(panel2,BorderLayout.CENTER);
        add(panel3,BorderLayout.SOUTH);

        jl1.addListSelectionListener(this);
        jl2.addListSelectionListener(this);
        jl3.addListSelectionListener(this);
    }

    public void valueChanged(ListSelectionEvent e) {
        if(jl1.getValueIsAdjusting()){
            String item = (String) jl1.getSelectedValue();
            tf1.setText(item);
        }

        if(jl2.getValueIsAdjusting()){
            int[] item2 = jl2.getSelectedIndices();
            String output = "";
            for(int i=0; i<item2.length; i++){
                if(item2[i] == 0)       output += "Chocolate ; ";
                else if(item2[i] == 1)       output += "Vanilla ; ";
                else if(item2[i] == 2)       output += "Strawberry ; ";
            }
            tf2.setText(output);
        }

        if(jl3.getValueIsAdjusting()) {
            int[] item3 = jl3.getSelectedIndices();
            String display = "";
            for(int x=0; x<item3.length; x++){
                if(item3[x] == 0)           display += "Blue ; ";
                else if(item3[x] == 1)      display += "Purple ; ";
                else if(item3[x] == 2)      display += "Red ; ";
                else if(item3[x] == 3)      display += "Yellow ; ";
                else if(item3[x] == 4)      display += "Green ; ";
            }
            tf3.setText(display);
        }
    }
}
