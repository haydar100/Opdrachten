import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {

    private JLabel tf;
    private JButton b;
    int teller = 0;
    public MyFrame() {
        setLayout(new FlowLayout());
        tf = new JLabel("?");
        add(tf);
        b = new JButton("Press me");
        add(b);
        b.addActionListener(this);
        setSize(300, 100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        teller ++;
        tf.setText("Knop is " + teller + " maal ingedrukt");


    }
}
