package systemByMoustafa;

import salaryCalculater.*;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
import employee.*;
import java.time.LocalDateTime;
import java.sql.Time;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s1 = 0;
		int s2 = 0;
		
		
		FullTime emp1 = new FullTime();
		
		emp1.setHour(10);
		emp1.nameScan();
		System.out.println(emp1.getName());
		String name = emp1.getName();
		
	
		if(emp1.getName().contains("a")) {
			System.out.println("you got 20jd bounes");
			s1 += 20;
			
			}
		
		
		if(emp1.getName().startsWith("U")) {
			System.out.println("you are unique");
		}
		
		BasicSalary emp1Salary = new BasicSalary();
		
		s1 = emp1Salary.calculateSalary(emp1.getHour(), emp1.getRate());
		
		System.out.println("First salary = " + s1);
		
		s1 = emp1Salary.calculatesalary(emp1.getHour(), emp1.getRate(), true, 5 );
		
		System.out.println("First salary = " + s1);
		
		PartTime emp2 = new PartTime();
		
		emp2.setHour(4);
		
		BasicSalary emp2Salary2 = new BasicSalary();
		
		s2 = emp2Salary2.calculateSalary(emp2.getHour(), emp2.getRate());
		
		System.out.println("second salary = " + s2);
		
		s2 = emp2Salary2.calculatesalary(emp2.getHour(), emp2.getRate(), true, 5);
		
		System.out.println("second salary = " + s2);
		
		System.out.println("max = " + Math.max(s1, s2));
		
		System.out.println(LocalDateTime.now());
		
		ArrayList<FullTime> fullTimeEmployees = new ArrayList<FullTime>();
		
		fullTimeEmployees.add(emp1);
		
		for(FullTime fullTime : fullTimeEmployees) {
			System.out.println(fullTime.getName());
		}
	}

}
