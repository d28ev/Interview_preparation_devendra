
public class MedianOfTwoSortedArray {

	public static void main(String[] args) {
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = {25,35,45,55};
		int m = arr1.length;
		int n = arr2.length;
		int total_mid = (m+n-1)/2;
		System.out.print("Median is : "+ getMedian(arr1, 0, m-1, arr2, m+n, total_mid));
	}
	
	public static double getMedian(int[] arr1, int start_first, int end_first, int[] arr2, int size, int total_mid) {
		int x = (start_first+end_first)/2;
		int y = (total_mid - (x+1));
		
		if(start_first>end_first) {
			return -1;
		}
		
		if(arr1[x]<=arr2[y+1] && arr2[y]<=arr1[x+1]) {
			if(size%2==0) {
				return (Integer.max(arr1[x], arr2[y])+Integer.min(arr1[x+1], arr2[y+1]))/2.0;
			}
			else {
				return Integer.max(arr1[x], arr2[y]);
			}
		}
		else if(arr1[x+1]<arr2[y]) {
			//go in right side of arr1
			return getMedian(arr1, x+1, end_first, arr2, size, total_mid);
		}
		else {
			return getMedian(arr1, start_first, x, arr2, size, total_mid);
		}
	}
}
