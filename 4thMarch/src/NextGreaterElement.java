import java.util.ArrayList;
import java.util.Stack;

/*
 * As part of these I learned how to use stack class in java
 * 1. Declaration
 * Stack<E> st = new Stack<E>(); where E can Integer, String etc.
 * 
 * 2. How to add element 
 * st.add(element);
 * 
 * 3. How to pop top element
 * st.pop();
 * 
 * 4. how to check if stack is empty or not 
 * st.isEmpty();
 * 
 */

public class NextGreaterElement {

	public static void main(String[] args) {
		int N = ArrayInput.getSize();
		int[] arr = new int[N];
		arr = ArrayInput.getInputArray(arr);
		ArrayInput.printArray(arr);
		
		//Method - 1 Just use two loop and you can figure out easily.
		//T(N) = O(N*N);
		
		//Method - 2 
		/*
		 * We will use stack 
		 * 1. if stack is empty
		 * 	just push the current element in the stack
		 * 2. if stack is not empty
		 * 	then you need to pop element from stack until current element is greater
		 * and just print current element as next greater for all of those elements
		 * 3. if current element is not greater than popped element
		 * push it back and also push current element.
		 * 
		 * T(N) : O(N*N)
		 */
		
		Stack<Integer> st = new Stack<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(st.isEmpty()) {
				st.push(arr[i]);
			}
			else {
				while(!st.isEmpty()) {
					int poppedElement = st.pop();
					if(arr[i]>poppedElement) {
						System.out.println(poppedElement + "  -->  "+ arr[i]);
					}
					else {
						st.push(poppedElement);
						st.push(arr[i]);
						break;
					}
				}
				if(st.isEmpty()) {
					st.push(arr[i]);
				}
			}
		}
		
		while(!st.isEmpty()) {
			System.out.println(st.pop() + "  -->  "+ -1);
		}

	}

}
