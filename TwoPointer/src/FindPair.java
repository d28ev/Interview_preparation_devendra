import java.util.Arrays;

public class FindPair {

	public static void main(String[] args) {
		int[] arr = {10,5,30,40,50,60,70};
		int n = 7;
		int key = 80;
		
		//Step 1 : if array is not sorted, then sort the array.
		Arrays.sort(arr);
		
		int low = 0;
		int high = n-1;
		while(low<high) {
			int curr_sum = arr[low]+arr[high];
			if(curr_sum == key) {
				System.out.println("Pair is : "+ arr[low]+ ", "+ arr[high]);
				break;
			}
			else if(curr_sum > key) {
				high--;
			}
			else {
				low++;
			}
		}

	}
	
	
	/**
	 * TIme complexity :
	 * sorting : O(nlogn)
	 * O(n)
	 * 
	 * T(n) = O(nlogn) + O(n)
	 * T(n) = O(nlogn);
	 * 
	 * Space Complexity : O(1);
	 */

}
