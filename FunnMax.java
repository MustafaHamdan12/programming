
public class FunnMax {

	public static void main(String[] args) {
		int a = 10, b = 25, c = 9;
		System.out.println(maxValue(a, b, c));

	}
	public static String maxValue(int a, int b, int c) {
	if(a > b && a > c) {
		return ("a is the biggest value" + a);
	}else if(b > a && b > c) {
		return ("b is the biggest value " + b);
	}else {
		return ("c is the biggest value " + c);
	}
	
	}
	
	}
