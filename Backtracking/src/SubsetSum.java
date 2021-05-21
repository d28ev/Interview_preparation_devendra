
import java.util.*;

public class SubsetSum {

	public static void main(String[] args) {
		int[] arr = {15, 22, 14, 26, 32, 9, 16, 8};
		int sum = 53;
		
		ArrayList<Integer> list = new ArrayList<>();
		printMatchingSubset(arr, sum, arr.length, 0, list, 0);
		
		
	}
	
	private static void printMatchingSubset(int[] arr, int sum , int size, int curr_ind, ArrayList<Integer> list, int curr_sum) {
		if(curr_ind>=size) {
			if(curr_sum == sum) {
				for(int i=0;i<list.size();i++) {
					System.out.print(list.get(i)+ " ");
				}
				System.out.println();
			}
			return;
		}
		
		//I can take curr_index as part of my subset.
		list.add(arr[curr_ind]);
		printMatchingSubset(arr, sum , size, curr_ind+1,list, curr_sum+arr[curr_ind]);
		
		//Backtracking
		list.remove((Integer)arr[curr_ind]);
		
		//i will not consider curr_index as part of my subset.
		printMatchingSubset(arr, sum , size, curr_ind+1,list, curr_sum);
	}

}
