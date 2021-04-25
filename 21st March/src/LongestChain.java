import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestChain {

	public static void main(String[] args) {
		int start[]= {5, 39, 15, 27, 50};
		int end[]= {24, 60, 28, 40, 90};
		
		Map<Integer, Integer> mp = new HashMap<>();
		for(int i=0;i<end.length;i++) {
			mp.put(end[i], start[i]);
		}
		
		Arrays.sort(end);
		for(int i=0;i<end.length;i++) {
			start[i]= mp.get(end[i]);
		}
		
		for(int i=0;i<start.length;i++) {
			System.out.println(start[i]+" "+ end[i]);
		}
		
		int[] maxChain = new int[start.length];
		for(int i=0;i<maxChain.length;i++) {
			maxChain[i]=1;
		}
		
		for(int i=1;i<start.length;i++) {
			for(int j=i-1;j>=0;j--) {
				if(start[i]>end[j]) {
					maxChain[i] = Integer.max(maxChain[i], maxChain[j]+1);
				}
			}
		}
		
		System.out.println("ANs is : "+ maxChain[start.length-1]);

	}

}
