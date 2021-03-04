
public class MaxMinHeap {

	public static void main(String[] args) {
		int N = ArrayInput.getSize();
		int arr[] = new int[N];
		arr = ArrayInput.getInputArray(arr);
		
		//form the array such that it satisfy the max heap property.
		/*int len = arr.length;
		for(int i=(len/2);i>=0;i--) {
			maxHeapify(arr, i);
		}
		
		//print after converting to max heap.
		ArrayInput.printArray(arr); */
		
		//form the array such that it satisfy the min heap property.
		int len = arr.length;
		for(int i=(len/2);i>=0;i--) {
			minHeapify(arr, i);
		}

		//print after converting to min heap.
		ArrayInput.printArray(arr);
	}
	
	public static void maxHeapify(int arr[], int i) {
		int l = (2*i) + 1;
		int r = (2*i) + 2;
		
		if(l>=arr.length)
			return;
		int largest=i;
		
		if(l<arr.length && arr[l]>arr[i]) {
			largest = l;
		}
		
		if(r<arr.length && arr[r]>arr[largest]) {
			largest = r;
		}
		
		//swap i and largest index data.
		int temp = arr[i];
		arr[i] = arr[largest];
		arr[largest] = temp;
		
		maxHeapify(arr, largest);
	}
	
	public static void minHeapify(int arr[], int i) {
		int l = (2*i) + 1;
		int r = (2*i) + 2;
		
		if(l>=arr.length)
			return;
		int lowest=i;
		
		if(l<arr.length && arr[l]<arr[i]) {
			lowest = l;
		}
		
		if(r<arr.length && arr[r]<arr[lowest]) {
			lowest = r;
		}
		
		//swap i and largest index data.
		int temp = arr[i];
		arr[i] = arr[lowest];
		arr[lowest] = temp;
		
		minHeapify(arr, lowest);
	}

}
