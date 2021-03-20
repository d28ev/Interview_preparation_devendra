import java.util.ArrayList;
import java.util.HashSet;

public class MaxLengthConcatenatedString {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("abcd");
		list.add("efgh");
		list.add("temp");
		
		ArrayList<String> ans = new ArrayList<>();
		
		printMaxLength(list, 0, ans);
		
		int max_len=0;
		for(int j=0;j<ans.size();j++) {
			String temp = ans.get(j);
			System.out.println(temp);
			if(max_len<temp.length()) {
				max_len = temp.length();
			}
		}
		
		System.out.println("Maximum length is : "+max_len);

	}
	
	public static void printMaxLength(ArrayList<String> list, int index, ArrayList<String> ans) {
		if(index>=list.size()) {
			return;
		}
		String str = list.get(index);
		if(ans.size()>0) {
			for(int j=0;j<ans.size();j++) {
				String temp = ans.get(j);
				if(checkUniqueCharacter(temp+str)) {
					ans.add(temp+str);
				}
			}
		}
		else {
			if(checkUniqueCharacter(str))
				ans.add(str);
		}
		
		printMaxLength(list,index+1, ans);
	}
	
	public static boolean checkUniqueCharacter(String str) {
		HashSet<Character> set = new HashSet<>(); 
	     
	     
	    for(int i = 0; i < str.length(); i++) 
	    { 
	        if (set.contains(str.charAt(i))) 
	        { 
	            return false; 
	        } 
	        set.add(str.charAt(i)); 
	    } 
	    return true; 
	}

}
