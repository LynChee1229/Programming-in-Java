// To create a frame

import javax.swing.*;

public class MyFrame {
    public static void main (String [] args){
        JFrame fr = new JFrame("This is a frame.");     // without extends, use "JFrame"
        fr.setSize(300,200);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
