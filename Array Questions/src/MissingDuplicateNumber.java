import java.util.HashMap;
import java.util.Map;

public class MissingDuplicateNumber {

	public static void main(String[] args) {
		int N = ArrayInput.getSize();
		int arr[] = new int[N];
		arr = ArrayInput.getInputArray(arr);
		
		//arr = {1,2,3,3,5}  missing = 4, duplicate = 3
		//Method -1 simple brute force 
		//run two loop and you can figure out duplicate and missing by count logic.
		//Time : O(n*n)
		
		//Method - 2
		//we can use hash map to keep count.
		/*
		Map<Integer, Integer> mp = new HashMap<>();
		for(int i=0;i<N;i++) {
			if(mp.containsKey(arr[i]))
				mp.put(arr[i], mp.get(arr[i])+1);
			else {
				mp.put(arr[i], 1);
			}
		}
		
		for(int i=1;i<=N;i++) {
			if(mp.containsKey(i)) {
				if(mp.get(i)==2) {
					System.out.println("Duplicate Number is : "+ i);
				}
			}
			else {
				System.out.println("Missing Number is : "+ i);
			}
		}
		*/
		
		//Method - 3
		//Can we do it in O(n).
		
		

	}

}
