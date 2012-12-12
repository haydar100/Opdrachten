import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {

    private JLabel lab;
    private JButton b1, b2;
    private JTextField tf;

    public MyFrame() {
        setLayout(new FlowLayout());
         tf = new JTextField("", 10);

        tf.setEditable(false);add(tf);

        tf.setOpaque(true);


        b1 = new JButton("Knop 1");
        add(b1);
        b1.addActionListener(this);
        b2 = new JButton("Knop 2");
        add(b2);
        b2.addActionListener(this);




        setSize(150, 170);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == b1) {
            tf.setText("knop 1");
        }
        if (event.getSource() == b2) {
           tf.setText("knop 2");
        }




    }
}
