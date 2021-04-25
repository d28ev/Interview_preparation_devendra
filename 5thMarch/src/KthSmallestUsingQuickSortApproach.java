
public class KthSmallestUsingQuickSortApproach {

	public static void main(String[] args) {
		int arr[] = {30, 20, 9, 4, 80, 13, 40};
		int k = 7;
		System.out.println("Kth smallest number is : "+ partitionLogic(arr, 0, arr.length-1, k));

	}
	
	static int partitionLogic(int[] arr, int l, int h, int k) {
		int pos = partition(arr, l, h);
		if(pos == (k-1)) {
			return arr[pos];
		}
		else {
			if(pos>(k-1)) {
				return partitionLogic(arr, l, pos-1, k);
			}
			else {
				return partitionLogic(arr, pos+1, h, k);
			}
		}
	}
	
	static int partition(int[] arr, int l, int h) {
		int pivot = arr[h];
		int ind = l;
		for(int i=l;i<h;i++) {
			if(arr[i]<pivot) {
				swap(arr, i, ind);
				ind++;
			}
		}
		
		swap(arr, ind, h);
		return ind;
	}
	
	static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}
