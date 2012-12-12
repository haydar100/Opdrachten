import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{

  private JTextField tf, tf2, tf3;
  private JButton b, b2, b3;
  private int cijfer ;
  private int cijfer2 ;

  public MyFrame() {
    setLayout(new FlowLayout());

    b = new JButton("Werp steen1"); add(b);
    b.addActionListener(this);
    tf = new JTextField(5); add(tf);
    tf.setEditable (false);
    b2 = new JButton("Werp steen2"); add(b2);
    b2.addActionListener(this);
    tf2 = new JTextField(5); add(tf2);
    tf2.setEditable(false);
    b3 = new JButton("Bereken de winst"); add(b3);
    b3.addActionListener(this);
    tf3 = new JTextField(10); add(tf3);


    setSize(200, 300);
		setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public void actionPerformed(ActionEvent event) {


 if (event.getSource() == b ) {
	   	  cijfer = 1 + (int) (Math.random()*6);
	   	  tf.setText (Integer.toString(cijfer));

  }

 if (event.getSource() == b2 ) {
	 cijfer2 = 1 + (int) (Math.random()*6);
	 tf2.setText (Integer.toString(cijfer2));

 }

 String goed1 = tf.getText();
 String goed2 = tf2.getText();

 if (event.getSource() == b3 ) {
	if (goed1.equals(goed2))
	tf3.setText ("jij wint");
	else
	tf3.setText ("jij verliest");
}
}
}




