import java.util.Stack;

/*
 * 	The stock span problem is a financial problem
 *  where we have a series of n daily price quotes for a 
 * 	stock and we need to calculate span of stock’s price for all n days.
	The span Si of the stock’s price on a given day i 
	is defined as the maximum number of consecutive days 
	just before the given day, for which the price of the stock 
	on the current day is less than or equal to its price on the given day.
 */
public class StockSpan {

	public static void main(String[] args) {
		int N = ArrayInput.getSize();
		int[] arr = new int[N];
		arr = ArrayInput.getInputArray(arr);
		ArrayInput.printArray(arr);
		
		//input : {100,80,60,70,60,75,85};
		//output : {1,1,1,2,1,4,6};
		
		//input : { 10, 4, 5, 90, 120, 80 }; 
		//output : { 1, 1, 2, 4, 5, 1 };
		
		//Method -1 for each index, i can traverse back till the point elements are less than or 
		//equal to.
		//T(N)=O(N*N)
		
		//Method - 2 Using stack: where stack will store index
		//1. for each index i
		//2. check if stack is not empty & stack peek is smaller than current index 
		//	 then pop the element
		//3. Repeat the same step again until stack is empty or stack peek is greater 
		//   than current index
		//4. if stack is empty ans[i] = i+1
		//   else ans[i]= i-st.peek();
		
		//findSpanUsingStack(arr, N);
		
		
		//Method - 3
		//No need to stack for storing index
		
		findSpanWithoutUsingStack(arr, N);
	}
	
	public static void findSpanUsingStack(int[] arr, int N) {
		Stack<Integer> st = new Stack<>();
		st.push(0);
		int[] ans = new int[N];
		ans[0] = 1;
		for(int i=1;i<arr.length;i++) {
			while(!st.isEmpty() && arr[i]>=arr[st.peek()]) {
				st.pop();
			}
			
			if(st.isEmpty()) {
				ans[i] = i+1;
			}
			else {
				ans[i] = i-st.peek();
			}
			
			st.push(i);
		}
		
		System.out.println("Span array is : ");
		ArrayInput.printArray(ans);
	}
	
	public static void findSpanWithoutUsingStack(int[] arr, int N) {
		int[] ans = new int[N];
		ans[0] = 1;
		int counter;
		
		for(int i=1;i<N;i++) {
			counter = 1;
			while((i-counter)>=0 && arr[i]>=arr[i-counter]) {
				counter += ans[i-counter];
			}
			
			ans[i] = counter;
		}
		
		ArrayInput.printArray(ans);
	}
}
