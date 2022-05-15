package employee;

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
