
public class MaximumSumContiguousSubArray {

	public static void main(String[] args) {
		int N = ArrayInput.getSize();
		int arr[] = new int[N];
		arr = ArrayInput.getInputArray(arr);
		
		//Logic for contiguous subarray.
		
		int curr_sum = 0;
		int max_sum = Integer.MIN_VALUE;
		int start=0;
		int end = 0;
		for(int i=0;i<N;i++) {
			curr_sum += arr[i];
			
			if(curr_sum < 0) {
				curr_sum = 0;
				start = i+1;
			}
			else {
				if(max_sum < curr_sum) {
					end = i;
					max_sum = curr_sum;
				}
			}
		}	
		System.out.println(max_sum);
		System.out.println("Range is : ["+start+", "+end+" ]");
	}
}
