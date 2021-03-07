import java.util.HashMap;

public class WordMoreThanOne {

	public static void main(String[] args) {
		String input = "my name is devendra and what is your name devendra";
		
		String[] words = input.split(" ");
		
		HashMap<String, Integer> mp = new HashMap<>();
		
		for(int i=0;i<words.length;i++) {
			//System.out.println(words[i]);
			if(mp.containsKey(words[i])) {
				mp.put(words[i], mp.get(words[i])+1);
			}
			else {
				mp.put(words[i], 1);
			}
		}
		
		for(String str : mp.keySet()) {
			if(mp.get(str) > 1) {
				System.out.println(str);
			}
		}
	}
}
