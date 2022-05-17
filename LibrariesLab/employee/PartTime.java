package employee;

import java.util.Scanner;

public class PartTime {
	
	public PartTime() {
		this.rate = 5;
	}
	
	public PartTime(int hour, int rate) {
		this.hour = hour;
		this.rate = rate;
	}
	
	
	public PartTime(int hour) {
		this.hour = hour;
		this.rate = 5;
	}
	
	private int hour;
	private int rate;
	private String name;
	
	
	public int getHour() {
		return hour;
	}
	
	public void setHour(int hour) {
		this.hour = hour;
	}


	public int getRate() {
		return rate;
	}


	public void setRate(int rate) {
		this.rate = rate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void nameScan() {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("enter emplyee name");
		this.name = scan1.next();
	}
	
	
	
}
