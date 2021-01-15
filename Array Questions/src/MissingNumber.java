/*
 * You are given a list of n-1 integers and these integers are in the range of 1 to n. 
 * There are no duplicates in the list. 
 * One of the integers is missing in the list. Write an efficient code to find the missing integer.
 * Input: arr[] = {1, 2, 4, 6, 3, 7, 8}
Output: 5
Explanation: The missing number from 1 to 8 is 5

Input: arr[] = {1, 2, 3, 5}
Output: 4
Explanation: The missing number from 1 to 5 is 4
 */
public class MissingNumber {

	public static void main(String[] args) {
		int N = ArrayInput.getSize();
		int arr[] = new int[N];
		arr = ArrayInput.getInputArray(arr);
		
		//Logic for finding missing number.
		//Method - 1
		//run two loops and  find from 1 to N which is not present.
		//Time complexity : O(n*n)
		
		//Method - 2
		//Sort the array and then you can find in one loop
		//Time complexity : O(nlogn)
		
		//Method - 3
		//You can take hashmap to keep count of each element
		//then you can get in one loop only
		//Time complexity : O(n) but in this case space complexity is : O(n)
		
		//Method - 4
		/*
		 * since we know that array range is 1 to n
		 * we know how to find sum of 1 to n in constant time using formula
		 * n(n+1)/2
		 * then just run loop on given array and find actual sum.
		 * missing num = n(n+1)/2 - actual_sum;
		 */
		
//		int actual_sum = 0;
//		for(int i=0;i<N;i++) {
//			actual_sum += arr[i];
//		}
		//since N is equal to n-1 so just increment by 1 to get total sum.
//		N += 1;
//		int ans = ((N*(N+1))/2 ) - actual_sum;
//		System.out.println("Missing number is : "+ ans);
//		
		//Note : above approach can lead to integer overflow for large value of N.
		
		//Method - 5
		int sum = 0;
		for(int i =0;i<N;i++) {
			sum += (i+1);
			sum -= arr[i];
		}
		
		sum+= (N+1);
		
		System.out.println("Missing number is : "+ sum);
	}

}
