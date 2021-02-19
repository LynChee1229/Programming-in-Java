// To create a program that extends JFrame

import javax.swing.*;

public class MyFrame2 extends JFrame {
    public static void main (String [] args) {
        MyFrame2 fr = new MyFrame2("This is a frame");  // extended, use CLASS NAME.
        fr.setSize(300,200);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public MyFrame2(String s) {
        setTitle(s);
    }
}
