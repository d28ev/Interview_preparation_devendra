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
		
		/*
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
		*/
        //----------------------------------------------------------------------------------------------------
		
		//Method - 4
		/*
		 * Step 1 : segregate all negative number in the start of the array
		 * Step 2 : Now run the logic only on positive numbers.
		 * Step 3 : mark arr[number] = -1* arr[number]; where number is arr[i]-1
		 */
		int count = 0;
		for(int i=0;i<N;i++) {
			if(arr[i]<1) {
				int temp = arr[count];
				arr[count] = arr[i];
				arr[i] = temp;
				
				count++;
			}
		}
		int arr2[] = new int[N-count+1];
		
		for(int i=count;i<N;i++) {
			arr2[i-count] = arr[i];
		}
		
		for(int i=0;i<(N-count);i++) {
			int x = Math.abs(arr2[i]) -1 ;
			if(x <N && arr2[x]>0) {
				arr2[x] = -1 * arr2[x];
			}
		}
		
		boolean found = false;
		for(int i=0;i<(N-count);i++) {
			if(arr2[i]>0) {
				System.out.println("Smallest positive missing number : "+ (i+1));
				found = true;
				break;
			}
		}
		
		if(found == false)
		System.out.println("Smallest positive missing number : "+ (N-count+1));
	}

}
