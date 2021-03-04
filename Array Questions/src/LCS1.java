
public class LCS1 {
	static int max_len;

	public static void main(String[] args) {
		String str1 = "aaabcadaacccccc";
		String str2 = "cdcdcdaaabcadaacc";
		
		int i=0,j=0;
		maxLength(str1, str2, i, j, 0);
		System.out.println(max_len);

		
	}
	
	public static void maxLength(String str1, String str2, int i, int j, int curr_len) {
		if(i>=(str1.length()) || j>=(str2.length())) {
			if(curr_len > max_len) {
				max_len = curr_len;
			}
			return;
		}
		
		
		if(str1.charAt(i) == str2.charAt(j)) {
			maxLength(str1, str2, i+1, j+1, curr_len+1);
		}
		
		if(curr_len > max_len) {
			max_len = curr_len;
		}
		curr_len = 0;
		maxLength(str1, str2, i+1, j, curr_len);
		maxLength(str1, str2, i, j+1, curr_len);
	}

}
