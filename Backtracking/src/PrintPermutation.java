import java.util.HashMap;
import java.util.Map;

public class PrintPermutation {

	public static void main(String[] args) {
		String str = "abcd";
		int length = str.length();
		char[] current = new char[length];
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
			else {
				map.put(str.charAt(i), 1);
			}
		}
		
		getPermutations(str,length,0, current, map);

	}
	
	private static void getPermutations(String str, int length, int index, char[] current, Map<Character, Integer> map) {
		if(index>=length) {
			for(int i=0;i<index;i++) {
				System.out.print(current[i]);
			}
			System.out.println();
			return;
		}
		
		//at current index -> i can use any one of the character.
		for(Character key : map.keySet()) {
			if(map.get(key)>0) {
				current[index] = key;
				map.put(key, map.get(key)-1);
				getPermutations(str, length, index+1, current, map);
				//Backtracking - V V Important
				map.put(key, map.get(key)+1);
			}
		}
	}

}
