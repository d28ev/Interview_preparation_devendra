
public class StringCompression {

	public static void main(String[] args) {
		//String input = "aaaaaabbbbbccc";
		String input = "wwwwaaadexxxxxx";
		String ans = "";
		
		int i=0;
		int len = input.length();
		while(i<len) {
			char ch = input.charAt(i);
			int count = 1;
			while((i+1)<len && ch==input.charAt(i+1)) {
				count++;
				i++;
			}
			
			if(count >1) {
				ans += ch;
				ans+= count;
			}
			else {
				ans += ch;
			}
			i++;
		}
		
		System.out.println("Ans is : "+ ans);

	}

}
