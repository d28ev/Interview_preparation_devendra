import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class InfixToPostfix {

	public static void main(String[] args) {
		/*
		 * operator : priority
		 * 		^ :			3 (highest priority)
		 * 	* and / :		2
		 * 	+ and - :		1 (lowest priority)
		 * Rule 1 : if stack top has higher priority , then pop it
		 * Rule 2 : if stack top has same priority , then also pop it
		 * Rule 3 : if ) found then pop from stack until u get ( and all the middle operator
		 * add to the postfix expression.
		 * 
		 */
		
		String infix =  "a+b*(c^d-e)^(f+g*h)-i";
		System.out.println("Infix expression is : "+ infix);
		
		Map<Character, Integer> mp = new HashMap<>();
		mp.put('+', 1);
		mp.put('-', 1);
		mp.put('*', 2);
		mp.put('/', 2);
		mp.put('^', 3);
		mp.put('(', 0);
		
		System.out.println(mp.get('+') < mp.get('*'));
		
		Stack<Character> st = new Stack<>();
		
		
		//^
		//*
		//+
		String postfix = "";
		for(int i=0;i<infix.length();i++) {
			char ch = infix.charAt(i);
			if(ch>='a' && ch <='z') {
				postfix += ch;
			}else if(st.isEmpty()) {
				st.push(ch);
			}
			else if(ch == '(') {
				st.push(ch);
			}
			else if(ch == ')') {
				while(true) {
					char ch1 = st.peek();
					if(ch1 != '(') {
						st.pop();
						postfix += ch1;
					}
					else {
						st.pop();
						break;
					}
				}
			}else if((mp.containsKey(st.peek()) && mp.containsKey(ch)) && mp.get(st.peek()) >= mp.get(ch)) {
				while(true) {
					char ch1 = st.peek();
					if((mp.containsKey(st.peek()) && mp.containsKey(ch)) && mp.get(st.peek()) >= mp.get(ch)) {
						postfix += ch1;
						st.pop();
					}
					else {
						st.push(ch);
						break;
					}
					
					if(st.isEmpty()) {
						st.push(ch);
						break;
					}
				}
			}
			else {
				st.push(ch);
			}
		}
		
		while(!st.isEmpty()) {
			postfix += st.peek();
			st.pop();
		}
		
		System.out.println("Postfix expression is : "+ postfix);
	}

}
