
public class circleArea {

	public static void main(String[] args) {
		int raduis;
		raduis = 5;
		float area;
		area = 0;
		System.out.println("enter the half of the rauis");
		area = circleArea(raduis);
		printout(area);
	}
	public static float circleArea(int dai) {
		float pi = 3.14f;
		float area = pi * (dai * dai);
		return area;
	}
	public static void printout(float area) {
		
	
		System.out.println("the area of the circle is " + area );
		
	}
}
