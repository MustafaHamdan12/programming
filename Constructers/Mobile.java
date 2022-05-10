package packege1;

public class Mobile {
	
	public Mobile()
	{
		
	}
	



	public Mobile(String brand, String color, int yearOfProduction) {
		this.brand = brand;
		this.color = color;
		this.yearOfProduction = yearOfProduction;
	}


	private String brand;
	
	private String color;	
	
	private int yearOfProduction;
	
	
	
	
	public String getBrand() {
		return brand;
	}




	public void setBrand(String brand) {
		this.brand = brand;
	}




	public String getColor() {
		return color;
	}




	public void setColor(String color) {
		this.color = color;
	}




	public int getYearOfProduction() {
		return yearOfProduction;
	}




	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}




	void dialNumber(int phoneNumber)
	{
		System.out.println("daialling "+ phoneNumber);
	}
	
	static void getCall(String callerName)
	{
		System.out.println(callerName + " is calling you");
	}
	
	void answerCall(boolean answer)
	{
		if(answer) {
			System.out.println("the call is answerd");
		} else {
			System.out.println("the call isn't answered");
		}
	}
}
