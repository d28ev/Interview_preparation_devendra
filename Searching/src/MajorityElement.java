
public class MajorityElement {

	public static void main(String[] args) {
		int[] arr = {1,4,3,5,7, 2};
		int n=arr.length;
		
		//boyer moore vote algo
		int majorityElement = findCandidate(arr, n);
		
		//verify the count;
		int count = 0;
		for(int i=0;i<n;i++) {
			if(arr[i]==majorityElement) {
				count++;
			}
		}
		
		if(count>(n/2)) {
			System.out.println("Majority Element is : "+ majorityElement);
		}
		else {
			System.out.println("No element found");
		}

	}
	
	private static int findCandidate(int[] arr, int n) {
		if(n<1) {
			return -1;
		}
		int m = arr[0];
		int count = 1;
		for(int i=1;i<n;i++) {
			if(count == 0) {
				m = arr[i];
				count = 1;
			}
			else {
				if(m == arr[i]) {
					count++;
				}
				else {
					count--;
				}
			}
		}
		
		return m;
	}

}
