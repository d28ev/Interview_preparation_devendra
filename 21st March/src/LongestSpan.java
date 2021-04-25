
public class LongestSpan {

	public static void main(String[] args) {
//		int[] first = {0,1,0,0,0,0};
//		int[] second = {1,0,1,0,0,1};
		
//		int[] first = {0, 1, 0, 1, 1, 1, 1};
//	    int[] second = {1, 1, 1, 1, 1, 0, 1};
	    
//	    int[] first = {0,0,1,0};
//	    int[] second = {1,1,1,1};
		
		 int[] first = {0,0,0};
		 int[] second = {1,1,1};
		
		int first_sum =0;
		int second_sum =0;
		int[] diff = new int[2*first.length+1];
		for(int i=0;i<(2*first.length+1);i++) {
			diff[i]=-1;
		}
		
		int max_len =0;
		
		for(int i=0;i<first.length;i++) {
			first_sum+=first[i];
			second_sum+=second[i];
			
			int d = first_sum-second_sum;
			if(d==0) {
				max_len = (i+1);
			}
			else {
				d+= first.length;
			}
			
			if(diff[d]==-1) {
				diff[d] = i;
			}
			else {
				max_len = Integer.max(max_len, i-diff[d]);
			}
		}
		
		System.out.println("Ans is : "+ max_len);
	}
}
