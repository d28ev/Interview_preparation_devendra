import java.util.Arrays;

public class PairSumInArray {

	public static void main(String[] args) {
		int N = ArrayInput.getSize();
		int arr[] = new int[N];
		arr = ArrayInput.getInputArray(arr);
		
		int sum = 30;
		
		//method -1 
		//you can run two loop and then you can find but time complexity will be O(n*n)
		
		//method - 2 using sorting we can achieve using two pointer concept.
		Arrays.sort(arr);
		
//		for(int i=0;i<N;i++) {
//			System.out.print(arr[i]+ " ");
//		}
//		System.out.println(arr);
		
		int low = 0;
		int high = N-1;
		while(low<=high) {
			int tempSum = arr[low]+arr[high];
			if(tempSum == sum) {
				System.out.println("Pair is : ["+arr[low]+ ", "+ arr[high]+ " ]");
				low++;
			}
			else if(tempSum < sum) {
				low++;
			}
			else
				high--;
		}

	}

}
