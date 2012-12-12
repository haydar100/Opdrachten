import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener
{
	private JLabel lab1, lab2;
	private JTextField tf;
	private JButton b;

	public MyFrame () {
		setLayout(new FlowLayout());

		lab1 = new JLabel ("Tik maandnummer in:");
		add(lab1);
		tf = new JTextField(10);
		add(tf);
		b = new JButton("Lees in");
		add(b);
		b.addActionListener(this);
		lab2 = new JLabel ("Hier komt de uitvoer");
		add(lab2);

		setSize (100, 150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		int maandnr = Integer.parseInt(tf.getText());
		String s = "";
		switch (maandnr) {
			case 1: s = "Januari"; break;
			case 2: s = "Februari"; break;
			case 3: s = "Maart"; break;
			case 4: s = "April"; break;
			case 5: s = "Mei"; break;
			case 6: s = "Juni"; break;
			case 7: s = "Juli"; break;
			case 8: s = "Augustus"; break;
			case 9: s = "September"; break;
			case 10: s = "Oktober"; break;
			case 11: s = "November"; break;
			case 12: s = "December"; break;
			default: s = "Ongeldig maandnummer"; break;
		}
		lab2.setText("      " +s);
	}
}






