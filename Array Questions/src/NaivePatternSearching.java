
public class NaivePatternSearching {

	public static void main(String[] args) {
		
		String text = "my name is my devendra, my father my name is ramjas yadav";
		String pattern = "my";
		int text_length = text.length();
		int pattern_length = pattern.length();
		
		//pattern matching
		for(int i=0;i<(text_length-pattern_length+1);i++) {
			int j;
			for(j=0;j<(pattern_length);j++) {
				if(text.charAt(i+j)!= pattern.charAt(j))
					break;
			}
			
			if(j==pattern_length) {
				System.out.println("Pattern found at index : "+ i);
			}
		}

	}

}

/**
 * What is the best case?
The best case occurs when the first character of the pattern is not present in text at all.

txt[] = "AABCCAADDEE"; 
pat[] = "FAA";
The number of comparisons in best case is O(n).
 * 
 * 
 * What is the worst case ?
The worst case of Naive Pattern Searching occurs in following scenarios.

1) When all characters of the text and pattern are same.
txt[] = "AAAAAAAAAAAAAAAAAA"; 
pat[] = "AAAAA";

2) Worst case also occurs when only the last character is different.
txt[] = "AAAAAAAAAAAAAAAAAB"; 
pat[] = "AAAAB";

The number of comparisons in the worst case is O(m*(n-m+1))

Note : The KMP matching algorithm improves the worst case to O(n).
 * 
 * */
