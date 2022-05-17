package salaryCalculater;

public class BasicSalary {
	
	public int calculateSalary(int _hour, int _rate) {
		int total = _hour * _rate;
		
		return total;
	}

	
	
	public int calculatesalary(int _hour, int _rate, boolean overTime, int overTimeCount) {

		int salary = calculateSalary(_hour, _rate);
		
		if(overTime) {
			
			return OverTimeSalary.overTimeSalary(salary, overTimeCount);
		
		}
		
		return salary;
	
	}
}