import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener
{
	private JButton b;
	private JPanel p;
	public MyFrame() {
		setLayout(new FlowLayout());
		p = new JPanel();
		p.setPreferredSize(new Dimension(300, 200));
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
		Graphics g =p.getGraphics();
		g.drawRect(60, 40, 30, 130);
		g.drawRect(100, 20, 30, 150);
		g.drawRect(140, 60, 30, 110);

		g.setColor(Color.RED);
		g.fillRect(60, 40, 30, 130);

		g.setColor(Color.BLUE);
		g.fillRect(100, 20, 30, 150);

		g.setColor(Color.GREEN);
		g.fillRect(140, 60, 30, 110);


		g.setColor(Color.BLACK);
		g.drawString( "1994", 60, 185);
		g.drawString( "1995", 100, 185);
		g.drawString( "1996", 140, 185);

	}
}