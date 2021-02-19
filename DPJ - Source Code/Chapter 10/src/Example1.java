import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example1 extends JApplet implements ActionListener {
    public void init() {
        JButton btn = new JButton("Click Me!");
        btn.addActionListener(this);
        add(btn);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String title = "Greeting";
        String message = "Hello from the Swing User Interface Library";
        JOptionPane.showMessageDialog(null,message,title,JOptionPane.INFORMATION_MESSAGE);
    }
}
