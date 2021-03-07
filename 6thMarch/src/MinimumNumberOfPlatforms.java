
public class MinimumNumberOfPlatforms {

	public static void main(String[] args) {
		/*
		 * int[] arr = {900, 940, 950, 1100, 1500, 1800};
		   int[] dept = {910, 1200, 1120, 1130, 1900, 2000};
		
			ans : 3
		 */
//		double[] arr = {9.00, 9.40};
//		double[] dept = {9.10, 12.00};
		//ans : 1
		
		double[] arr = {9.00, 9.40, 9.50, 11.00, 15.00, 18.00};
		double[] dept = {9.10, 12.00, 11.20, 11.30, 19.00, 20.00};
		
		int min_platforms=Integer.MIN_VALUE;
		int curr=1;
		
		for(int i=0;i<dept.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(dept[i]>arr[j]) {
					curr++;
				}
				else {
					if(min_platforms < curr) {
						min_platforms = curr;
						curr = 1;
					}
					break;
				}
			}
		}
		
		System.out.println("Minimum_platforms : "+ min_platforms);
		
		
		

	}

}
