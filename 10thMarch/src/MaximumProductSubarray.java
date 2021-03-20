/*
 * Given an array that contains both positive and negative integers, find the product of the maximum product subarray. Expected Time complexity is O(n) and only O(1) extra space can be used.

Examples:

Input: arr[] = {6, -3, -10, 0, 2}
Output:   180  // The subarray is {6, -3, -10}

Input: arr[] = {-1, -3, -10, 0, 60}
Output:   60  // The subarray is {60}

Input: arr[] = {-2, -40, 0, -2, -3}
Output:   80  // The subarray is {-2, -40}
 */
public class MaximumProductSubarray {

	public static void main(String[] args) {
		int[] arr = new int[] {6, -3, -10, 0, 2};
		
		/*
		 * Method -1 simple brute force
		 * O(n*n)
		 * 
		 */
		
		/*
		 * Method - 2 using O(n)
		 * 
		 */
		int min_product = 1;
		int max_product = 1;
		int max_so_far = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				max_product = max_product * arr[i];
				min_product = min(min_product * arr[i], 1);
			}
			else if(arr[i] == 0) {
				min_product = 1;
				max_product = 1;
			}
			else {
				int temp = max_product;
				max_product = min_product * arr[i];
				min_product = min(temp*arr[i], 1);
			}
			
			if(max_so_far < max_product) {
				max_so_far = max_product;
			}
		}
		
		System.out.println("Answer is : "+ max_so_far);
	}
		
		public static int min(int a, int b) {
			if(a<b) {
				return a;
			}
			return b;
		}
		
		public static int max(int a, int b) {
			if(a>b) {
				return a;
			}
			return b;
		}


}
