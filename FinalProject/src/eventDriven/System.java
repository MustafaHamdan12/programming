package eventDriven;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class System {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Patient Registry");
		frame.setVisible(true);
		frame.setSize(450, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		JLabel label1 = new JLabel("Patient name : ");
		frame.add(label1);
		label1.setBounds(25, 15, 150, 10);
		
		JTextField tF1 = new JTextField();
        frame.add(tF1);
        tF1.setBounds(25, 27, 150, 25);
        
        JLabel label2 = new JLabel("Patient age : ");
		frame.add(label2);
		label2.setBounds(250, 15, 150, 15);
		
		JTextField tF2 = new JTextField();
        frame.add(tF2);
        tF2.setBounds(250, 30, 150, 25);
        
        JLabel label3 = new JLabel("Patient blood type : ");
		frame.add(label3);
		label3.setBounds(25, 75, 150, 20);
		
		JTextField tF3 = new JTextField();
        frame.add(tF3);
        tF3.setBounds(25, 95, 150, 25);
        
        JLabel label4 = new JLabel("wight : ");
		frame.add(label4);
		label4.setBounds(250, 75, 150, 15);
		
		JTextField tF4 = new JTextField();
        frame.add(tF4);
        tF4.setBounds(250, 90, 150, 25);
        
        JLabel label5 = new JLabel("Hight:  ");
		frame.add(label5);
		label5.setBounds(25, 135, 150, 20);
		
		JTextField tF5 = new JTextField();
        frame.add(tF5);
        tF5.setBounds(25, 155, 150, 25);
        
        JLabel label6 = new JLabel("degree : ");
		frame.add(label6);
		label6.setBounds(250, 135, 150, 15);
		
		JTextField tF6 = new JTextField();
        frame.add(tF6);
        tF6.setBounds(250, 155, 150, 25);
        
        JCheckBox cB1 = new JCheckBox("Male");
        frame.add(cB1);
        cB1.setBounds(150, 200, 150, 40);
        
        JCheckBox cB2 = new JCheckBox("Female");
        frame.add(cB2);
        cB2.setBounds(150, 230, 150, 40);
        
        JButton bt1 = new JButton("save");
        frame.add(bt1);
        bt1.setBounds(125, 300, 100, 40);
        
        JButton bt2 = new JButton("cancel");
        frame.add(bt2);
        bt2.setBounds(225, 300, 100, 40);
       
        
        
        
       
        
        
        
        
        bt2.addActionListener(new ActionListener() {
        	
        	
        	public void actionPerformed(ActionEvent e) {
        		frame.dispose();
        		
        		
        	}
        });
        
        
	}

}
