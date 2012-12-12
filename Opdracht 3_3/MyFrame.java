import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener
{
	private JButton b;
	private JPanel p;

	public MyFrame() {
		setLayout (new FlowLayout());

		p = new JPanel();
		p.setPreferredSize (new Dimension(300, 200));
		p.setBackground(Color.WHITE);
		add(p);

		b = new JButton("Press me");
		add(b);
		b.addActionListener(this);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent event) {
		Graphics g = p.getGraphics();
		g.drawLine(0, 0, 100, 100);
	    g.drawRect(20, 30, 40, 50);
	    g.drawRect(30, 70, 80, 90);
	    g.drawOval(40, 60, 90, 80);
	}
}