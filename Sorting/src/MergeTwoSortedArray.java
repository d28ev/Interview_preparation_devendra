
public class MergeTwoSortedArray {

	public static void main(String[] args) {
		int[] arr1 = {10,30,50};
		int[] arr2 = {20,25,40,60};
		
		int m = arr1.length;
		int n = arr2.length;
		
		int[] ans = new int[m+n];
		
		int i=0;
		int j=0;
		int k = 0;
		
		while(i<m && j<n) {
			if(arr1[i]<arr2[j]) {
				ans[k]= arr1[i];
				i++;
				k++;
			}
			else {
				ans[k]=arr2[j];
				j++;
				k++;
			}
		}
		
		//if arr1 elements are left
		while(i<m) {
			ans[k]=arr1[i];
			i++;
			k++;
		}
		
		//if arr2 elements are left 
		while(j<n) {
			ans[k]=arr2[j];
			j++;
			k++;
		}
		
		
		//ans is sorted and it has all the elements of both the arrays
		for(int ind=0;ind<(m+n);ind++) {
			System.out.print(ans[ind]+ " ");
		}
		
		/*
		 * Time Complexity : O(m+n)
		 * Space complexity : O(m+n)
		 */

	}

}
