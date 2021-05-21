import java.util.Stack;

public class StockSpanProblem {

	public static void main(String[] args) {
		int[] arr = {100, 80,60,70,60,75,85,105};
		int len = arr.length;
		
		//method - 1
		//usingSimpleTwoLoops(arr);
		
		//Method - 2
		usingStack(arr);

	}
	
	private static void usingSimpleTwoLoops(int[] arr) {
		int[] ans = new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			int count = 1;
			int j=i-1;
			while(j>=0 && arr[j]<=arr[i]) {
					count++;
					j--;
			}
			
			System.out.print(count+ " ");
		}
	}
	
	private static void usingStack(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int[] ans = new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			if(st.isEmpty()) {
				st.push(i);
			}
			else {
				//keep popping the elements from stack until they are smaller than current element.
				while((!st.isEmpty()) && arr[st.peek()]<arr[i]) {
					int index = st.pop();
					ans[index] = st.isEmpty() ? (index+1) : (index-st.peek());
				}
				st.push(i);
			}
		}
		
		while(!st.isEmpty()) {
			int index = st.pop();
			ans[index] = st.isEmpty() ? (index+1) : (index-st.peek());
		}
		
		//print ans array
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+ " ");
		}
	}

}
