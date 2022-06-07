package eventDriven;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Task2 {
	
	public static void main(String[] args) {
			
			JFrame infoFrame =new JFrame();   
			String usersName = JOptionPane.showInputDialog(infoFrame,"What is your Name");
			
			String usersAge = JOptionPane.showInputDialog(infoFrame,"What is your age");
			
			JOptionPane.showMessageDialog( infoFrame, "My name is "+usersName+" I am "+usersAge+" years old" );

		}
	}
