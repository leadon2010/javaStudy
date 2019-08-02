package javaGui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GuiExample {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.add(new JLabel("Welcome to home"));
		frame.add(panel);
		
		frame.setResizable(false);
		frame.setVisible(true);
//		frame.setPreferredSize(new Dimension());
		frame.setSize(840, 840 * 3 / 4);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
