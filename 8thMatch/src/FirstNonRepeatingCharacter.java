import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String str = "my name is devendra,yjfhakdnfkja  jfakj jf jadl;ajf;aewemoiqnc";
		Map<Character, Integer> mp = new HashMap<>();
		Map<Character, Integer> mpIndex = new HashMap<>();
		
		/*
		 * Method -1 
		 * traverse loop two times.
		 * in first iteration find count of each character
		 * in 2nd iteration stop at the character for which count is 1.
		 */
		
		/*
		 * Method - 2
		 * We can optimize this in 2nd iteration.
		 */
		for(int i=0;i<str.length();i++) {
			if(mp.containsKey(str.charAt(i))) {
				mp.put(str.charAt(i), mp.get(str.charAt(i))+1);
			}
			else {
				mp.put(str.charAt(i), 1);
				mpIndex.put(str.charAt(i), i);
			}
		}
		
		int min_index = Integer.MAX_VALUE;
		char ans='0';
		for(Character ch : mp.keySet()) {
			if(mp.get(ch)==1 && min_index > mpIndex.get(ch)) {
				min_index = mpIndex.get(ch);
				ans = ch;
			}
		}
		if(min_index != Integer.MAX_VALUE)
			System.out.println("First non repeating character is : "+ ans);
		else {
			System.out.println("Non-repeating character not found");
		}
	}

}
