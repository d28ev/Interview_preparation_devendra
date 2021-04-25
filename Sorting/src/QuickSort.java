
public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {10,50,200,15,40,29, 4, 400, 2};
		int n = arr.length;
		
		//call quick sort
		int start = 0;
		int end = n-1;
		quickSort(arr, start, end);
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+ " ");
		}

	}
	
	public static void quickSort(int[] arr, int start, int end) {
		if(start>end) {
			return;
		}
		
		if(start==end) {
			return;
		}
		
		int pivotIndex = partition(arr, start, end);
		quickSort(arr, start, pivotIndex-1);
		quickSort(arr, pivotIndex+1, end);
	}
	
	public static int partition(int[] arr, int start, int end) {
		if(start>end) {
			return -1;
		}
		
		if(start==end) {
			return start;
		}
		
		int pivot = arr[end];
		int pivotIndex = start;
		for(int i=start;i<end;i++) {
			if(arr[i]<pivot) {
				int temp = arr[i];
				arr[i] = arr[pivotIndex];
				arr[pivotIndex] = temp;
				pivotIndex++;
			}
		}
		
		//last swap - end and pivotiNdex
		int temp = arr[end];
		arr[end] = arr[pivotIndex];
		arr[pivotIndex] = temp;
		
		return pivotIndex;
		
	}

}
