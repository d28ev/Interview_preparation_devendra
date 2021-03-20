import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class LongestWordInDictionary {

	public static void main(String[] args) {
		/*
		 * Giving a dictionary and a string ‘str’, find the longest string in dictionary which can be formed by deleting some characters of the given ‘str’.

			Examples:

			Input : dict = {"ale", "apple", "monkey", "plea"}   
        	str = "abpcplea"  
			Output : apple 

			Input  : dict = {"pintu", "geeksfor", "geeksgeeks", 
                                        " forgeek"} 
         	str = "geeksforgeeks"
			Output : geeksgeeks
		 */
		
		List<String> dict = new ArrayList<>();
		dict.add("ale");
		dict.add("apple");
		dict.add("monkey");
		dict.add("plea");
		
		String str = "abpcplea";
		int max_len = 0;
		String ans = "";
		for(int i=0;i<dict.size();i++) {
			String word = dict.get(i);
			
			int word_index = 0;
			int str_index = 0;
			while(word_index<word.length() && str_index<str.length()) {
				if(word.charAt(word_index) == str.charAt(str_index)) {
					word_index++;
					str_index++;
				}
				else {
					str_index++;
				}
			}
			
			if(word_index == word.length()) {
				if(max_len < word.length()) {
					max_len = word.length();
					ans = word;
				}
			}
		}
		
		System.out.println("Maximum length and word is : "+ ans.length() + " "+ ans);

	}

}
