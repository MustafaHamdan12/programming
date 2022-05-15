package systemByMoustafa;

import salaryCalculater.*;

import employee.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s1, s2 = 0;
		
		FullTime emp1 = new FullTime();
		
		emp1.setHour(10);
		
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
	}

}
