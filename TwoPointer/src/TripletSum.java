import java.util.Arrays;

public class TripletSum {

	public static void main(String[] args) {
		//Int[] arr = {20,10,40,30,50,60,70}  key = 80
		int[] arr = {20,10,40,30,50,60,70};
		int key = 80;
		int n = 7;
		
		Arrays.sort(arr);
		boolean isFound = false;
		for(int i=0;i<n;i++) {
			int low = i+1;
			int high = n-1;
			int new_sum = key - arr[i];
			while(low<high) {
				int sum = arr[low]+arr[high];
				if(sum==new_sum) {
					System.out.println("triplet is : "+ arr[i]+ ","+ arr[low]+ ", "+ arr[high]);
					isFound = true;
					break;
				}
				else if(sum>new_sum) {
					high--;
				}
				else {
					low++;
				}
			}
			
			if(isFound) {
				break;
			}
		}
	}

}
