
public class QuickSort {

	public static void main(String[] args) {
		int N = ArrayInput.getSize();
		int arr[] = new int[N];
		arr = ArrayInput.getInputArray(arr);
		
		//heap sort
		quick_sort(arr, 0, N-1);
		
		//sorted array
		ArrayInput.printArray(arr);

	}
	
	public static int findPartitionPickPivotAsLastElement(int arr[], int low, int high) {
		if(low>high)
			return -1;
		
		int pivot = arr[high];
		
		int i = low-1;
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		//swap i++ and high
		i++;
		int temp = arr[i];
		arr[i] = arr[high];
		arr[high] = temp;
		
		return i;
	}
	
	public static int findPartitionPickPivotAsFirstElement(int arr[], int low, int high) {
		if(low>high)
			return -1;
		
		int pivot = arr[low];
		
		int i = high+1;
		for(int j=high;j>low;j--) {
			if(arr[j]>pivot) {
				i--;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		//swap i++ and high
		i--;
		int temp = arr[i];
		arr[i] = arr[low];
		arr[low] = temp;
		
		return i;
	}
	
	
	
	public static void quick_sort(int arr[], int low, int high) {
		System.out.println("low - high"+ low + " "+ high);
		if(low<high) {
			//int pivotIndex = findPartitionPickPivotAsLastElement(arr, low, high);
			int pivotIndex = findPartitionPickPivotAsFirstElement(arr, low, high);
			if(pivotIndex != -1) {
				quick_sort(arr, low, pivotIndex-1);
				quick_sort(arr, pivotIndex+1, high);
			}
		}
	}

}
