package eventDriven;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class Task7 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("SpongeBob");
		JLabel label = new JLabel();
		ImageIcon happy = new ImageIcon("C:\\Users\\mosta\\OneDrive\\Desktop\\Java\\University1\\src\\eventDriven\\happy.png");
		ImageIcon sad = new ImageIcon("C:\\Users\\mosta\\OneDrive\\Desktop\\Java\\University1\\src\\eventDriven\\sad.png");
		ImageIcon mad = new ImageIcon("C:\\Users\\mosta\\OneDrive\\Desktop\\Java\\University1\\src\\eventDriven\\mad.png");

		label.setIcon(happy);
		frame.add(label);

		label.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {

				label.setIcon(mad);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				label.setIcon(mad);
			}

			@Override
			public void mouseReleased(MouseEvent e) {

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				label.setIcon(happy);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				label.setIcon(sad);

			}

		});
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 450);
		frame.setLayout(new FlowLayout());
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}