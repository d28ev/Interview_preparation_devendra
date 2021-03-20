import java.util.HashMap;
import java.util.Map;

public class PrintPermutationsOfAStringHavingDuplicate {

	public static void main(String[] args) {
		String str = "aabc";
		
		Map<Character, Integer> mp = new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			if(mp.containsKey(str.charAt(i))) {
				mp.put(str.charAt(i), mp.get(str.charAt(i))+1);
			}
			else {
				mp.put(str.charAt(i), 1);
			}
		}
		
		char[] temp = new char[4];
		int temp_index = 0;
		printPermutation(mp, 4, temp, temp_index);
		

	}
	
	public static void printPermutation(Map<Character, Integer> mp,int length, char[] temp, int temp_index) {
		if(temp_index>=length) {
			for(int j=0;j<temp_index;j++) {
				System.out.print(temp[j]+ "");
			}
			System.out.println();
			return;
		}
		
		for(Character key : mp.keySet()) {
			if(mp.get(key)>0){
				temp[temp_index] = key;
				mp.put(key, mp.get(key)-1);
				printPermutation(mp, length, temp, temp_index+1);
				mp.put(key, mp.get(key)+1);
			}
		}
	}

}
