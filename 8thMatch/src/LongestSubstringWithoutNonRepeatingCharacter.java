import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutNonRepeatingCharacter {

	public static void main(String[] args) {
		//String str = "geeksforgeeks";
		//ans : eksforg (len = 7)
		
		//Input 2 : str = abcdefabcd
		//Ans : abcdef (len = 7)
		String str = "abcdefabcd";
		
		Map<Character, Integer> countMap = new HashMap<>();
		Map<Character, Integer> indexMap = new HashMap<>();
		int start = 0;
		int startIndex = 0;
		int max_len = Integer.MIN_VALUE;
		
		for(int i=0;i<str.length();i++) {
			if(countMap.containsKey(str.charAt(i))) {
				if(indexMap.get(str.charAt(i)) >= start) {
					int len = (i-start);
					if(max_len < len) {
						max_len = len;
						startIndex = start;
					}
					start = indexMap.get(str.charAt(i))+1;
				}
				indexMap.put(str.charAt(i), i);
			}
			else {
				countMap.put(str.charAt(i), 1);
				indexMap.put(str.charAt(i), i);
			}
		}
		
		System.out.println("Max len is : "+ max_len);
		System.out.println("StartIndex is : "+ startIndex);
		System.out.println("substring is : "+ str.substring(startIndex, startIndex+max_len));

	}

}
