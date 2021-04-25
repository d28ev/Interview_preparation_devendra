
public class MergeKSortedArray {

	public static void main(String[] args) {
		int k = 3;
		int n = 4;
//		int arr[][] = { {1, 3, 5, 7}, 
//				{2, 4, 6, 8}, 
//				{0, 9, 10, 11}} ;
		int arr[][] = { {1, 5, 6, 8}, 
				{2, 4, 10, 12}, 
				{3, 7, 9, 11}, 
				{13, 14, 15, 16}} ;
		int[] first = arr[0];
		for(int i=1;i<arr.length;i++) {
			first = mergeTwoArray(first, arr[i]);
		}
		
		for(int i=0;i<first.length;i++) {
			System.out.print(first[i]+ " ");
		}

	}
	
	public static int[] mergeTwoArray(int[] arr1, int[] arr2){
		int i=0;
		int j=0;
		int[] ans = new int[arr1.length+arr2.length];
		int k =0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				ans[k++] = arr1[i++];
			}
			else {
				ans[k++] = arr2[j++];
			}
		}
		
		while(i<arr1.length) {
			ans[k++] = arr1[i++];
		}
		
		while(j<arr2.length) {
			ans[k++] = arr2[j++];
		}
		
		return ans;
	}

}
