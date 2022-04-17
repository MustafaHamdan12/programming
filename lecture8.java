
public class lecture8 {

	public static void main(String[] args) {
	int age;
	age = 18;
	System.out.println("please enter your age");
	boolean result = ageChecker(age);
	System.out.println(result);
	
	}
	public static boolean ageChecker(int old) {
		if(old >= 18) {
			return true;
		}
		else {
			return false;
		}
	}
}
