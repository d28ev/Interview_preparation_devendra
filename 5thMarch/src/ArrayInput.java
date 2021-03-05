import java.util.Scanner;

public class ArrayInput {

	static int N;
	static Scanner sc;
	
	public static int getSize() {
		System.out.println("Please enter size of an array(N) : ");
		sc = new Scanner(System.in);
		N = sc.nextInt();
		return N;
	}

	public static int[] getInputArray(int arr[]) {
		System.out.println("Enter array elements : ");
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		
		return arr;
	}
	
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
	}
}
