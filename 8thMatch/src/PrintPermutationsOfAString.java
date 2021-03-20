
public class PrintPermutationsOfAString {

	public static void main(String[] args) {
		String str = "abc";
		
		printPermuation(str, 0);

	}
	
	public static void printPermuation(String str, int i) {
		if(i>= str.length()) {
			System.out.println(str);
			return;
		}
		
		for(int j=i;j<str.length();j++) {
			str = swap(str, i, j);
			printPermuation(str, i+1);
			str = swap(str, i, j);
		}
	}
	
	public static String swap(String str, int i, int j) {
		if(i==j) {
			return str;
		}
		String temp = "";
		for(int k=0;k<str.length();k++) {
			if(k==i) {
				temp += str.charAt(j);
			}
			else if(k == j) {
				temp += str.charAt(i);
			}
			else {
				temp += str.charAt(k);
			}
		}
		
		return temp;
	}

}
