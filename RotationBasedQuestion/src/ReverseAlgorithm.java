
public class ReverseAlgorithm {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60};
		int k=4;
		
		/*reverseArray(arr, 0, k-1);
		reverseArray(arr, k, arr.length-1);
		reverseArray(arr, 0, arr.length-1);*/
		
		//
		int gcd = getGcd(arr.length, k);
		
		for(int i=0;i<gcd;i++) {
			int j = i;
			int  temp = arr[j];
			while(true) {
				int p = j+k;
				if(p>=arr.length) { // for cyclic order 
					p -= arr.length;
				}
				
				if(p==i) { //will tell us , hey u reached to starting point again.
					break;
				}
				arr[j] = arr[p];
				j = p;
			}
			
			arr[j] = temp;
		}
		
		//System.out.println(gcd);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}

	}
	
	private static int getGcd(int a, int b) {
		if(b==0) {
			return a;
		}
		else {
			return getGcd(b, a%b);
		}
	}
	
	private static void reverseArray(int[] arr, int start, int end) {
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

}
