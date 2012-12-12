import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {
	private JTextField tf1, tf2 ,tf3;
	private JButton is;
	private JLabel plus;

	public MyFrame() {
		setLayout(new FlowLayout() );
		tf1 = new JTextField(5);
		add(tf1);
		setLayout(new FlowLayout() );
		plus = new JLabel("+");
		add(plus);
		setLayout(new FlowLayout() );
		tf2 = new JTextField(5);
		add(tf2);
		setLayout(new FlowLayout() );
		is = new JButton ("=");
		is.addActionListener(this);
		add(is);
		setLayout(new FlowLayout() );
		tf3 = new JTextField(5);
		tf3.setEditable(false);
		add(tf3);


		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent event) {
		String s = tf1.getText();
		String a = tf2.getText();

		int som = 0;
		int som2 = 0;
		if (!s.equals("")) {
			som = Integer.parseInt(s);
			som2 = Integer.parseInt(a);
		}
	int somoptellen = som + som2;
	tf3.setText(" " + somoptellen);

	}
}

