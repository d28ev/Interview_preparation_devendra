/*
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, 
 * compute how much water it is able to trap after raining.
 */
public class TrappingRainWater {

	public static void main(String[] args) {
		/*
		 * Input: arr[]   = {2, 0, 2}
		   Output: 2

		   Input: arr[]   = {3, 0, 2, 0, 4}
           Output: 7

           Input: arr[] = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
           Output: 6 
		 */
		
		int N = ArrayInput.getSize();
		int[] arr = new int[N];
		arr = ArrayInput.getInputArray(arr);
		ArrayInput.printArray(arr);
		
		//Method - 1
		//For each element you need to check how much water we can fill on top of that.
		//so for each element find left max and right max
		//then water at that index will be : min(left_max, right_max) - arr[i]
		
		int ans = 0;
		
		for(int i=0;i<N;i++) {
			int left_max=arr[i];
			int right_max = arr[i];
			int j=i;
			while(j>=0) {
				if(left_max<arr[j]) {
					left_max = arr[j];
				}
				j--;
			}
			j=i;
			while(j<N) {
				if(right_max<arr[j]) {
					right_max = arr[j];
				}
				j++;
			}
			
			ans+= min(left_max, right_max) - arr[i];
		}
		
		System.out.print("Ans is : "+ ans);
		
		//Method - 2
		//we can improve the logic for finding left_max and right_max
		//and we can store them in two arrays
		//and then at each index ans is : max(leftArray[i], rightArray[i]) - arr[i]
		
		//Method - 3
		//No need to store these values
		//we can use two pointer approach.
		
		

	}
	
	public static int min(int a, int b) {
		if(a<b) return a;
		return b;
	}

}
