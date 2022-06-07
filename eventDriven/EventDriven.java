package eventDriven;

import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class EventDriven {
	
	    public static void main(String[]args){
	        // TODO Auto-generated method stubi
	        JFrame frame = new JFrame();// constructs frame initially invisible
	        frame.setVisible(true);
	        frame.setSize(500,500);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLayout(null);
	        
	        JLabel label=new JLabel("First Number");
	        frame.add(label);
	        label.setBounds(150,50,150,30);	        
	       
	        JTextField txtField = new JTextField();
	        frame.add(txtField);
	        txtField.setBounds(150, 80, 100, 30);
	        
	        JLabel label1=new JLabel("Second Number");
	        frame.add(label1);
	        label1.setBounds(150,125,150,30);
	        
	        JTextField txtField1 = new JTextField();
	        frame.add(txtField1);
	        txtField1.setBounds(150, 150, 100, 30);
	        
	        JLabel label2=new JLabel("result");
	        frame.add(label2);
	        label2.setBounds(150,180,150,30);
	        
	        JTextField txtField2 = new JTextField();
	        frame.add(txtField2);
	        txtField2.setBounds(150, 210, 100, 30);
	        txtField2.setEditable(false);
	        
	        JButton btn2 = new JButton("-");
	        frame.add(btn2);
	        btn2.setBounds(200,270,75,50);
	        
	        JButton btn1 = new JButton("+");
	        frame.add(btn1);
	        btn1.setBounds(120,270,75,50);
	        
	        
	        btn1.addActionListener(new ActionListener() {
	        
	        	@Override
				public void actionPerformed(ActionEvent e) {
	        		int num1 = Integer.parseInt(txtField.getText());
	        		int num2 = Integer.parseInt(txtField1.getText());
	        		
	        		int sum = num1 + num2;
	        		
	        		txtField2.setText(Integer.toString(sum));
	        		
	        	}});

	        btn2.addActionListener(new ActionListener() {
		        
	        	@Override
				public void actionPerformed(ActionEvent e) {
	        		int num1 = Integer.parseInt(txtField.getText());
	        		int num2 = Integer.parseInt(txtField1.getText());
	        		
	        		int sum = num1 - num2;
	        		
	        		txtField2.setText(Integer.toString(sum));
	        		
	        	}});
	    }
}
	        
	        

