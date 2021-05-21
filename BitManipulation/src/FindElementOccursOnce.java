
public class FindElementOccursOnce {

	public static void main(String[] args) {
		int[] arr = {3,4,3,6,6,6,7,7,7,1,1,1,8,3,4,4};
		
		//Method -1
		//usingExOr(arr);
		
		//Method - 2
		usingModWith3Logic(arr);
	}
	
	private static void usingExOr(int[] arr) {
		int one = 0;
		int two = 0;
		int common;
		for(int i=0;i<arr.length;i++) {
			two = two | (one & arr[i]);
			one = (one ^ arr[i]);
			
			common = one & two;
			
			//remove from one
			one = one & ~(common);
			//remove from two.
			two = two & ~(common);
			
		}
		
		System.out.println("Ans is : "+ one);
	}
	
	private static void usingModWith3Logic(int[] arr) {

		int res = 0;
		for(int i=0;i<=32;i++) {
			int x = 1<<i;
			int sum = 0;
			
			for(int j=0;j<arr.length;j++) {
				if((arr[j]&x) != 0) {
					sum++;
				}
			}
			
			if(sum %3 != 0) {
				res = res | x;
			}
		}
		
		System.out.println("Ans is : "+ res);
	}

}
