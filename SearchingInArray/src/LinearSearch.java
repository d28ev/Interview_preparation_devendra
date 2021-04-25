
public class LinearSearch {

	public static void main(String[] args) {
		int n=7;
		int[] arr = {20, 35, 40,10, 98,89, 12};
		int key = 20;
		boolean isFound = false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				System.out.println("Key found at index : "+i);
				isFound = true;
				break;
			}
		}
		if(!isFound) {
			System.out.println("Key is not present in the given array");
		}
	}
	
	/**
	 * T(n) = O(n)
	 * worst case:
	 * 1. if you are searching the last element of the array
	 * 2. if key is not present in the array
	 * 
	 * Best case :
	 * 1. when you are searching first element of the array
	 * O(1)
	 */

}
