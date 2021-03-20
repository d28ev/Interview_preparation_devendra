
public class WordBreakProblem {

	public static void main(String[] args) {
		String[] dictionary = {"i","e", "like", "same", "sung", "samsung", "mobile", "ice", "cream", "icecream", "man", "go", "mango"};
		
		String str = "ilikesamsunge";// 0 - 4
		
		if(isWordBreakPossible(str, 0, dictionary)) {
			System.out.print("Yes found");
		}
		else {
			System.out.print("Not found");
		}

	}
	
	public static boolean isWordBreakPossible(String str, int start, String[] dictionary) {
		if(start>=str.length()) {
			return true;
		}
		
		for(int j=0;j<dictionary.length;j++) {
			String word = dictionary[j];
			int endIndex = start+word.length();
			System.out.println(start+ " "+ endIndex);
			String substr = "";
			if(endIndex>=str.length()) {
				substr = str.substring(start);
			}
			else
				substr = str.substring(start, endIndex);
			System.out.println(word + " " + substr);
			if(compareString(word, substr)) {
				System.out.println(word);
				return isWordBreakPossible(str, start+word.length(), dictionary);
			}
		}
		
		return false;
		
		
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
