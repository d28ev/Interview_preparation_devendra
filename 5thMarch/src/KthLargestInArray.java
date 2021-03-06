import java.lang.reflect.Array;

public class KthLargestInArray {

	public static void main(String[] args) {
		
		int N = ArrayInput.getSize();
		int[] arr = new int[N];
		arr = ArrayInput.getInputArray(arr);
		int K = 2;
		
		//convert given array to max heap
		for(int i=(N/2)-1;i>=0;i--) {
			heapify(arr, i, N);
		}
		
		ArrayInput.printArray(arr);
		
		//delete k elements.
		for(int i=0;i<(K-1);i++) {
			arr[0] = arr[N-1];
			N--;
			
			//convert given array to max heap
			for(int j=(N/2)-1;j>=0;j--) {
				heapify(arr, j, N);
			}
		}
		
		System.out.print(K + "th largest element is : "+ arr[0]);
	}
	
	public static void heapify(int[] arr, int index, int N) {
		int leftChild = 2*index + 1;
		int rightChild = 2*index + 2;
		int largest = index;
		if(leftChild < N && arr[leftChild] > arr[largest]) {
			largest = leftChild;
		}
		
		if(rightChild < N && arr[rightChild] > arr[largest]) {
			largest = rightChild;
		}
		
		if(largest != index) {
			int temp = arr[index];
			arr[index] = arr[largest];
			arr[largest] = temp;
			heapify(arr, largest, N);
		}
	}

}
