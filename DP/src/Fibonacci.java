
public class Fibonacci {
	static int count = 0;

	public static void main(String[] args) {
		int n=6;
		int[] arr = new int[n+1];
		for(int i=0;i<(n+1);i++) {
			arr[i]=-1;
		}
		System.out.println(fib(n, arr));
		System.out.println("COunt is : "+ count);

	}
	
	private static int fib(int n, int[] arr) {
		//Base case is very important.
		if(n<=1) {
			arr[n] = n;
			return arr[n];
		}
		
		if(arr[n]!=-1) {
			return arr[n];
		}
		count++;
		
		arr[n] = fib(n-1, arr)+fib(n-2, arr);
		//top down memoization.
		return arr[n];
	}

}
