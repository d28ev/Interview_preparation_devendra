
public class WordBreakDP {

	public static void main(String[] args) {
		String[] dictionary = {"i","e", "like", "same", "sung", "samsung", "mobile", "ice", "cream", "icecream", "man", "go", "mango"};
		
		String str = "ilikesamsunge";// 0 - 4
		int len = str.length();
		
		int[] ans = new int[len];
		
		for(int j=0;j<dictionary.length;j++) {
			String word = dictionary[j];
			int endIndex = word.length();
			String substr = "";
			if(endIndex>=len)
				substr = str.substring(0);
			else
				substr = str.substring(0, word.length());
			
			
			
			
		}
		
		

	}
	
	public static boolean compareString(String a, String b) {
		if(a.length() != b.length())
			return false;
		
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i) != b.charAt(i)) {
				return false;
			}
		}
		
		return true;
	}

}
