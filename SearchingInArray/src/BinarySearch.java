//Ep - 1 : Searching in an Array | Binary Search | Linear Search | Data structure
public class BinarySearch {

	public static void main(String[] args) {
		//array should be sorted.
		int n = 7;
		int[] arr = {10,20,30,40,50,60,70};
		int key = 70;
		
		int start =0;
		int end = 6;
		
		System.out.println("index : "+ binarySearch(arr, start, end, key));

	}
	
	public static int binarySearch(int[] arr, int start , int end, int key) {
		//base case
		if(start<=end) {
			int mid = (start+end)/2;
			if(arr[mid]==key) {
				return mid;
			}
			else if(arr[mid]>key) {
				//left side array
				return binarySearch(arr, start, mid-1, key);
			}
			else {
				//right side array
				return binarySearch(arr, mid+1, end, key);
			}
		}
		
		return -1;//key is not present in an array
	}
}
