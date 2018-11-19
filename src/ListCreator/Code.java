package ListCreator;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Code {
	Font titleFont = new Font("Monospaced", Font.PLAIN, 30);
	public void go() {
		//Deprecated Code
		createFrame(0, 300, 200, "ListX");
	}private void createFrame(int ch, int x, int y, String title) {
		JFrame f = new JFrame(title);
		JPanel m = new JPanel(new BorderLayout()); f.add(m);
		JPanel s = new JPanel();m.add(s, BorderLayout.SOUTH);
		JPanel n = new JPanel();m.add(n, BorderLayout.NORTH);
		JPanel c = new JPanel();m.add(c, BorderLayout.CENTER);
		f.setVisible(true);f.setSize(x, y);f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);f.setLocationRelativeTo(null);
		switch(ch) {
		case 0:
			JLabel l = new JLabel("Lists"); l.setFont(titleFont); n.add(l);
			JLabel l1 = new JLabel("Made by: Evan Carter"); l1.setFont(new Font("TimesRoman", Font.PLAIN, 10)); c.add(l1);
			JButton b = new JButton("Edit"); JButton b1 = new JButton("New"); JButton b2 = new JButton("Settings"); JButton b3 = new JButton("Exit");
			s.add(b1); s.add(b); s.add(b2); s.add(b3);
			b3.addActionListener(e-> System.exit(0));
			b1.addActionListener(e->createFrame(1, 400, 400, "New"));
			b.addActionListener(e->createFrame(2, 400, 400, "Edit"));
			b2.addActionListener(e->createFrame(3, 300, 300, "Settings"));
			break;
		case 1:
			JLabel l2 = new JLabel("New");l2.setFont(titleFont); n.add(l2);
			break;
		case 2:
			break;
		case 3:
			break;
		}
	}
}
