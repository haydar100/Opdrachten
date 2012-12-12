import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{

  private JLabel lab1, lab2;
  private JTextField tf;
  private JButton b, b2, b3, bReset;
  private final String wachtwoord = "321";
  private String getal = "";


  public MyFrame() {
    setLayout(new FlowLayout());

    lab1 = new JLabel("Raad de geheime code"); add(lab1);
    tf = new JTextField(15); add(tf);
    b = new JButton("1"); add(b);
    b.addActionListener(this);
    b2 = new JButton("2"); add(b2);
    b2.addActionListener(this);
    b3 = new JButton("3"); add(b3);
    b3.addActionListener(this);
    bReset = new JButton("Clear"); add(bReset);
    bReset.addActionListener(this);
    lab2 = new JLabel("Hier komt de uitvoer"); add(lab2);

    setSize(230, 150);
		setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public void actionPerformed(ActionEvent event) {

	 if (event.getSource() == b ) {
		 getal = getal + "1" ;
		 tf.setText(getal);
	 }
	 if (event.getSource() == b2 ) {
	 		 getal = getal + "2" ;
	 		 tf.setText(getal);
	 }
	 if (event.getSource() == b3 ) {
	 		 getal = getal + "3" ;
	 		 tf.setText(getal);
	 }
	 if (event.getSource() == bReset ) {
	 		 getal = "";
	 		 tf.setText("");
	 		 lab2.setText("hier komt de uitvoer");
	 }

	 String wachtwoordgoed = tf.getText();
	 if (wachtwoordgoed.equals(wachtwoord) ) {
		 lab2.setText("Yes! geraden");
 }
 }
}
