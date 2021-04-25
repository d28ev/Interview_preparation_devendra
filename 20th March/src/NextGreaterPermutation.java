import java.util.Arrays;

public class NextGreaterPermutation {

	public static void main(String[] args) {
		//String input = "1221"; // 2112
		String input = "123";
		
		/*
		 * Start traversing from right to left
		 * and find character which is smaller than last element
		 * T(n*n)
		 */
		
		String ans = "";
		int at_i = -1;
		int at_j = -1;
		int len = input.length();
		for(int i=len-1;i>=0;i--) {
			for(int j=i-1;j>=0;j--) {
				if(input.charAt(j)<input.charAt(i)) {
					at_i = i;
					at_j = j;
					break;
				}
			}
			
			if(at_i !=-1 && at_j != -1) {
				break;
			}
		}
		
		if(at_i == -1 && at_j == -1) {
			System.out.println("Not possible to get next greater element");
		}		
		else {
		for(int i=0;i<len;i++) {
			if(i == at_j) {
				ans += input.charAt(at_i);
			}
			else if(i == at_i) {
				ans += input.charAt(at_j);
			}
			else {
				ans += input.charAt(i);
			}
		}
		//System.out.println("at_j"+ at_j);
		String ans1 = ans.substring(0, at_j+1);
		String ans2= ans.substring(at_j+1);
		//System.out.println(ans1 + " "+ ans2);
		char[] array = ans2.toCharArray();
		Arrays.sort(array);
		
		for(int i=0;i<array.length;i++) {
			ans1 += array[i];
		}
		
		System.out.println("Next greater number is : "+ ans1);
		}

	}

}

