import java.util.Scanner;

/*
 * Given a set of non-negative integers, and a value sum, determine 
 * if there is a subset of the given set with sum equal to given sum. 
 */
public class SubsetProblem {

	public static void main(String[] args) {
		/*
		 * Input: set[] = {3, 34, 4, 12, 5, 2}, sum = 9
		   Output: True  
		   There is a subset (4, 5) with sum 9.

			Input: set[] = {3, 34, 4, 12, 5, 2}, sum = 30
			Output: False
			There is no subset that add up to 30.
		 */

		
		int N = ArrayInput.getSize();
		int[] arr = new int[N];
		arr = ArrayInput.getInputArray(arr);

		System.out.println("Please enter Sum : ");
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		
		//Method - 1
		//using backtracking
		//but this approach will take exponential time complexity.
		// 2^N (since at each element their are two possiblities.
		int[] ans = new int[N];
		int count = 0;
		findSubsetArray(arr,N,sum, ans, count);
		
		//Method - 2
		//we can improve it using DP
		//it will be like take 2D matrix.
		
		printSubsetUsingDP(arr, N, sum);
		
		
	}
	
	public static void findSubsetArray(int[] arr, int N, int sum, int[] ans, int count) {
		//Base case
		if(sum == 0) {
			System.out.println("Subset array is : ");
			for(int i=0;i<count;i++) {
				System.out.print(ans[i]+ " ");
			}
			return;
		}
		
		if(N <=0) {
			return;
		}
		
		//there are two possiblity
		//include ith element or just ignore it
		findSubsetArray(arr, N-1, sum, ans, count);
		ans[count] = arr[N-1];
		findSubsetArray(arr, N-1, sum-arr[N-1], ans, count+1);
	}
	
	public static void printSubsetUsingDP(int[] arr, int N, int sum) {
		boolean[][] ans = new boolean[N][sum+1];
		
		for(int i=0;i<N;i++) {
			ans[i][0] = true;
		}
		for(int j=1;j<=sum;j++) {
			if(arr[0]==j)
				ans[0][j]=true;
			else
				ans[0][j]=false;
		}
		
		for(int i=1;i<N;i++) {
			for(int j=1;j<=sum;j++) {
				if(j < arr[i]) {
					ans[i][j]=ans[i-1][j];
				}
				else if(j >= arr[i]) {
					ans[i][j] = ans[i-1][j] || ans[i-1][j-arr[i]];
				}
			}
		}
		
		if(ans[N-1][sum])
			System.out.println("Subset found");
		else
			System.out.println("Subset not found");
			
	}

}
