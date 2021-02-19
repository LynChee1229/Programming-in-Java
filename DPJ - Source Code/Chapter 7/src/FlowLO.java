import javax.swing.*;
import java.awt.*;

public class FlowLO extends JFrame {
    private JButton btn1, btn2, btn3;

    public static void main(String [] args){
        FlowLO f = new FlowLO();
        f.setSize(350,120);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public FlowLO (){
        setTitle("Flow Layout - Right Alignment");
        setLayout(new FlowLayout(FlowLayout.RIGHT));    // setting alignment

        btn1 = new JButton("Button 1");
        btn2 = new JButton("Button 2");
        btn3 = new JButton("Button 3");

        add(btn1);
        add(btn2);
        add(btn3);
    }
}
