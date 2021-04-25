
public class MergeSort {

	public static void main(String[] args) {
		int[] arr = {20,100,90,40,60,45};
		int n = 6;
		
		mergeSort(arr, 0, 5);
		
		//print the sorted array
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	
	public static void mergeSort(int[] arr, int start, int end) {
		//Base case for the recursion
		if(start>end) {
			return;
		}
		
		if(start==end) {
			return;
		}
		
		int mid = (start+end)/2;
		mergeSort(arr, start, mid);
		mergeSort(arr, mid+1, end);
		mergeArray(arr, start, mid, end);
	}
	
	public static void mergeArray(int[] arr, int start, int mid, int end) {
		int[] ans = new int[end-start+1];
		
		int k = 0;
		int i= start;
		int j = mid+1;
		while(i<=mid && j<=end) {
			if(arr[i]<arr[j]) {
				ans[k]= arr[i];
				i++;
				k++;
			}
			else {
				ans[k]= arr[j];
				j++;
				k++;
			}
		}
		
		//if let say first has few elements left
		while(i<=mid) {
			ans[k]= arr[i];
			i++;
			k++;
		}
		
		//lf let say second array has few elements left which are not yet traversed
		while(j<=end) {
			ans[k]= arr[j];
			j++;
			k++;
		}
		
		//copy the element of ans array into the actual array
		for(int ind=0;ind<(end-start+1);ind++) {
			arr[start+ind] = ans[ind];
		}
	}

}
