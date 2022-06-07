package eventDriven;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Lab {
public static void main(String[] args) {
		
		JFrame frame = new JFrame("JFrame demo");
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		JButton stButton1 = new JButton("1st button");
		stButton1.setBounds(50, 10, 100, 30);
		stButton1.setForeground(Color.magenta);
		stButton1.setBackground(Color.darkGray);
		frame.add(stButton1);
		
	
		JButton ndButton2 = new JButton("2nd button");
		ndButton2.setBounds(160, 10, 100, 30);
		ndButton2.setForeground(Color.blue);
		ndButton2.setBackground(Color.darkGray);
		frame.add(ndButton2);
		
		JButton rdButton3 = new JButton("3rd button");
		rdButton3.setBounds(270, 10, 100, 30);
		rdButton3.setForeground(Color.green);
		rdButton3.setBackground(Color.darkGray);
		frame.add(rdButton3);
		
	}

	

}

