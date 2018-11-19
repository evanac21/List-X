package ListCreator;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Code {
	Font titleFont = new Font("Monospaced", Font.PLAIN, 30);
	@SuppressWarnings("unused")
	private String one, two, three, four, five, six, seven, eight, nine;
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
			b1.addActionListener(e->createFrame(1, 275, 400, "New"));
			b.addActionListener(e->createFrame(2, 275, 400, "Edit"));
			b2.addActionListener(e->createFrame(3, 300, 300, "Settings"));
			break;
		case 1:
			JLabel l2 = new JLabel("New");l2.setFont(titleFont); n.add(l2);
			JLabel l3 = new JLabel("1: ");JTextField ta = new JTextField(20);c.add(l3); c.add(ta);
			JLabel l4 = new JLabel("2: ");JTextField tf = new JTextField(20);c.add(l4); c.add(tf);
			JLabel l5 = new JLabel("3: ");JTextField tf1 = new JTextField(20);c.add(l5); c.add(tf1);
			JLabel l6 = new JLabel("4: ");JTextField tf2 = new JTextField(20);c.add(l6); c.add(tf2);
			JLabel l7 = new JLabel("5: ");JTextField tf3 = new JTextField(20);c.add(l7); c.add(tf3);
			JLabel l8 = new JLabel("6: ");JTextField tf4 = new JTextField(20);c.add(l8); c.add(tf4);
			JLabel l9 = new JLabel("7: ");JTextField tf5 = new JTextField(20);c.add(l9); c.add(tf5);
			JLabel l10 = new JLabel("8: ");JTextField tf6 = new JTextField(20);c.add(l10); c.add(tf6);
			JLabel l11 = new JLabel("9: ");JTextField tf7 = new JTextField(20);c.add(l11); c.add(tf7);
			JButton submit = new JButton("Submit"); s.add(submit);
			JButton clear = new JButton("Clear"); s.add(clear);
			submit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					one = ta.getText();
					two = tf.getText();
					three = tf1.getText();
					four = tf2.getText();
					five = tf3.getText();
					six = tf4.getText();
					seven = tf5.getText();
					eight = tf6.getText();
					nine = tf7.getText();
					f.dispose();
				}
			});
			break;
		case 2:
			JLabel la2 = new JLabel("Edit");la2.setFont(titleFont); n.add(la2);
			JLabel la3 = new JLabel("1: ");JTextField taa = new JTextField(20);c.add(la3); c.add(taa);
			JLabel la4 = new JLabel("2: ");JTextField tfa = new JTextField(20);c.add(la4); c.add(tfa);
			JLabel la5 = new JLabel("3: ");JTextField tf1a = new JTextField(20);c.add(la5); c.add(tf1a);
			JLabel la6 = new JLabel("4: ");JTextField tf2a = new JTextField(20);c.add(la6); c.add(tf2a);
			JLabel la7 = new JLabel("5: ");JTextField tf3a = new JTextField(20);c.add(la7); c.add(tf3a);
			JLabel la8 = new JLabel("6: ");JTextField tf4a = new JTextField(20);c.add(la8); c.add(tf4a);
			JLabel la9 = new JLabel("7: ");JTextField tf5a = new JTextField(20);c.add(la9); c.add(tf5a);
			JLabel la10 = new JLabel("8: ");JTextField tf6a = new JTextField(20);c.add(la10); c.add(tf6a);
			JLabel la11 = new JLabel("9: ");JTextField tf7a = new JTextField(20);c.add(la11); c.add(tf7a);
			JButton post = new JButton("Post"); s.add(post);
			JButton exit = new JButton("Back"); s.add(exit);
			post.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e1) {
					taa.setText(one);tfa.setText(two);tf1a.setText(three);tf2a.setText(four);tf3a.setText(five);tf4a.setText(six);tf5a.setText(seven);tf6a.setText(eight);tf7a.setText(nine);
					
				}
			});
			exit.addActionListener(e-> f.dispose());
			break;
		case 3:
			break;
		}
	}
}
