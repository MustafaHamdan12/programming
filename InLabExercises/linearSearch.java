
public class linearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 0, 1, 2, 3, 6, 66, 10, 5};
		int key = 10;
		boolean check = false;
		int num = 0;
		for(int i=0; i < arr.length; i++) {
			if(key == arr[i])
			{
				num++;
				System.out.println("found in" + i);
				check = true;
				
			}
		}
		
		if (check = false) {
			System.out.println("not found");
		}
		System.out.println("number of times found " + num);
	}

}
