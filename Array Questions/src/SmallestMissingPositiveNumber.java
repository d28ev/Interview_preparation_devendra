import java.util.HashMap;
import java.util.Map;
/*
 * Given array , you need to find smallest missing positive number.
 * int arr[] = {3, -2, -1, 4 , 1 , 10, 5};
 * Ans : 2
 */

public class SmallestMissingPositiveNumber {

	public static void main(String[] args) {
		int N = ArrayInput.getSize();
		
		int arr[] = new int[N];
		arr = ArrayInput.getInputArray(arr);
		
		
		
		//Method - 1 , simple brute force
		//just run two loops and you can figure out
		//T(n) = O(n*n) and Space complexity : O(1)
		
//-----------------------------------------------------------------
		/*
		 * Method - 2
		 * you can just use hash map to keep any number is present or not.
		 * T(n) : O(n) but Space complexity : O(n);
		 */
		
//		Map<Integer,Integer> mp = new HashMap<Integer, Integer>();
//		for(int i=0;i<N;i++) {
//			if(arr[i]>0 && arr[i]<=N) {
//				mp.put(arr[i],1);
//			}
//		}
//		
//		for(int i=1;i<=N;i++) {
//			if(!mp.containsKey(i)) {
//				System.out.println("Smallest Missing positive number is : "+ i);
//				break;
//			}
//		}
//---------------------------------------------------------------------------------------
		
		/*
		 * Method - 3
		 * Step 1 : first of all find if 1 is present or not.
		 * Step 2 : Now replace all negative number and all number > N by 1.
		 * Step 3 : Now add N to all number at element value index.
		 * 
		 * T(n) : O(n) and Space complexity : O(1)
		 */
		boolean found_1 = false;
		for(int i=0;i<N;i++) {
			if(arr[i]==1) {
				found_1 = true;
				break;
			}
		}
		if(found_1 == false) {
			System.out.println("Smallest Missing positive number is : "+ 1);
			return;
		}
		
		for(int i=0;i<N;i++) {
			if(arr[i]<0 || arr[i]>N) {
				arr[i] = 1;
			}
		}
		
		for(int i=0;i<N;i++) {
			arr[(arr[i]-1)%N] += N;
		}
		
		for(int i=0;i<N;i++) {
			if(arr[i]<N) {
				System.out.println("Smallest Missing positive number is : "+ (i+1));
				break;
			}
		}
		
		System.out.println("Smallest Missing positive number is : "+ (N+1));
	}

}
