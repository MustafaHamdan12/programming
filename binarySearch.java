
public class binarySearch {

	public static void main(String[] args) {
		int [] arr = {4, 7, 9, 13, 17, 23, 30, 50};
		int key = 17;
		int left = 0;
		int right = (arr.length) - 1;
		int ind = (right + left)/2;
		while(left <= right)
		{
			if(key == arr[ind]) {
				System.out.println("found in index " + ind);
				break;
			}
			else if(key > arr[ind]) {
				left = ind + 1;
			}
			else {
				right = ind - 1;
			}
			ind = (right + left)/2;
		}

	}

}
