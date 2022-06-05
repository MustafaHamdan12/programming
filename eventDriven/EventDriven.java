package eventDriven;

import java.awt.Checkbox;
import java.awt.FlowLayout;

import javax.swing.*;

public class EventDriven {
	
	    public static void main(String[]args){
	        // TODO Auto-generated method stubi
	        JFrame frame = new JFrame();// constructs frame initially invisible
	        frame.setVisible(true);
	        frame.setSize(500,500);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLayout(null);
	        JLabel label=new JLabel("Welcome to Programming");
	        frame.add(label);
	        label.setBounds(150,50,150,30);
	        JButton btnl = new JButton("click me");
	        frame.add(btnl);
	        btnl.setBounds(150,80,150,50);
	        
	        JTextField txtField = new JTextField();
	        frame.add(txtField);
	        txtField.setBounds(160, 210, 100, 30);
	        
	        JCheckBox chekBox = new JCheckBox();
	        frame.add(chekBox);
	        chekBox.setBounds(140, 200, 100, 50);
	        
	    }
}