package employee;

import java.util.Scanner;
public class FullTime {
	
	
	
	public FullTime(int hour, int rate) {
		this.hour = hour;
		this.rate = rate;
	}
	
	public FullTime(int hour) {
		this.hour = hour;
		this.rate = 10;
	}
	
	public FullTime() {
		
		this.rate = 10;
	}
	
	private int hour;
	private int rate;
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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
	
	public void nameScan() {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("enter emplyee name");
		this.name = scan1.next();
	}
	

}
