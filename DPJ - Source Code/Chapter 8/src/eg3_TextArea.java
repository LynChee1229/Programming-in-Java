import javax.swing.*;

public class eg3_TextArea extends JFrame {
    private JTextArea ta;
    private JPanel p;

    public static void main(String [] args) {
        eg3_TextArea f = new eg3_TextArea();
        f.setSize(400,210);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("JTextArea");
    }

    public eg3_TextArea() {
        ta = new JTextArea("Programming in Java", 8,12);
        ta.append("\nAll the best!!! Chan Lin Chee ^^");
        ta.setLineWrap(true);   // convert into comment to see the difference

        p = new JPanel();
        p.add(ta);
        add(p);
    }
}
