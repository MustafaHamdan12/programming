package employee;

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
	
	
	
	
}
