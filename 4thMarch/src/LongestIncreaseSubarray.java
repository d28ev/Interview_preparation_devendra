/*
 * Given an array containing n numbers. The problem is to find the length of the 
 * longest contiguous subarray such that every element in the subarray is 
 * strictly greater than its previous element in the same subarray. 
 * Expected Time Complexity should be O(n).
 */
public class LongestIncreaseSubarray {

	public static void main(String[] args) {
		int N = ArrayInput.getSize();
		int[] arr = new int[N];
		arr = ArrayInput.getInputArray(arr);
		ArrayInput.printArray(arr);
		
		/*
		 * Input : arr[] = {5, 6, 3, 5, 7, 8, 9, 1, 2}
			Output : 5
			The subarray is {3, 5, 7, 8, 9}

			Input : arr[] = {12, 13, 1, 5, 4, 7, 8, 10, 10, 11}
			Output : 4
			The subarray is {4, 7, 8, 10}
		 */
		
		int max_len = 1;
		int curr_len = 1;
		int startIndex=0,endIndex=0;
		
		for(int i=1;i<N;i++) {
			if(arr[i]>arr[i-1]) {
				curr_len++;
			}
			else if(max_len <= curr_len) {
				max_len = curr_len;
				startIndex = i-curr_len;
				endIndex = i-1;
				
				curr_len = 1;
			}
		}
		
		System.out.println("Max len subarray is : "+ max_len);
		System.out.print("Subarray is : ");
		for(int i=startIndex;i<=endIndex;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}
