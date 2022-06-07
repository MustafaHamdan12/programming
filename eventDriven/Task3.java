package eventDriven;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Task3 {
	
	public static void main(String[] args) {
			
			JFrame logInFrame = new JFrame("Login page");
			
			logInFrame.setVisible(true);
			logInFrame.setSize(300, 200);
			logInFrame.setLocationRelativeTo(null);
			logInFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			logInFrame.setLayout(null);
			
			JLabel user_name = new JLabel("user name:");
			user_name.setBounds(10,0, 100,30);  
			logInFrame.add(user_name);
			
			JLabel password = new JLabel("password :");
			password.setBounds(10,30, 100,30);  
			logInFrame.add(password);
			
			JTextField username=new JTextField();  
			username.setBounds(120,5, 120,20);
			logInFrame.add(username);
			
			JTextField pass=new JTextField();  
			pass.setBounds(120,40, 120,20);
			logInFrame.add(pass);
			
			JButton login = new JButton("Login");
			login.setBounds(130, 80, 75, 30);
			logInFrame.add(login);
			
			login.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					String _name = username.getText();
					String _pass = pass.getText();
					
					if (_name.equalsIgnoreCase("Admin") && _pass.equalsIgnoreCase("123")) {
						
						System.out.println("Login Successfully");
					}
					
					else {
						
						System.out.println("Try again later");
					}
				}
			});
	}

	}


