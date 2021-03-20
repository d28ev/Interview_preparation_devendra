
public class SearchInSortedRotatedArray {

	public static void main(String[] args) {
//		int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
//		int key = 3;
		
//		int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
//		int key = 30;
		
		int[] arr =  {30, 40, 50, 10, 20};
		int key = 10;
		
		int index = search(arr, 0, arr.length-1, key);
		if(index != -1) {
			System.out.println("Found at index : "+ index);
		}
		else {
			System.out.println("Not Found");
		}

	}
	
	public static int search(int[] arr, int low, int high, int key) {
		if(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid]==key) {
				return mid;
			}
			else if(arr[mid]>arr[low]) { //it means left array is sorted
				if(key>=arr[low] && key<=arr[mid]) {
					return search(arr, low, mid-1, key);
				}
				else {
					return search(arr,mid+1, high, key);
				}
			}else {
				if(key>=arr[mid] && key <= arr[high]) {
					return search(arr, mid+1, high, key);
				}
				else {
					return search(arr, low, mid-1, key);
				}
			}
		}
		
		return -1;
	}	

}
