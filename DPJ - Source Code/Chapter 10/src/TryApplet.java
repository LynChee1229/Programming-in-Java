import javax.swing.*;
import java.awt.*;

public class TryApplet extends JApplet {
    public void init() {
        setSize(290,120);
        setLayout(new FlowLayout());
        JButton btn = new JButton("OK!");
        JLabel lb = new JLabel("Hello world! ");
        add(btn);
        add(lb);
    }
}
