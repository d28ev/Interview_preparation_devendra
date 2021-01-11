import java.util.Scanner;

/*
 * Write code to remove duplicates in a sorted array
 * input : int arr[] = {2, 4,4, 5, 9, 10,10,20};
 * output : {2,5,9,20}
 */
public class RemoveDuplicate {
	
	public static void main(String[] args) {
		
		//If you want to take input as an array
		int N=10; //size of an array
		System.out.println("Please enter size of an array(N) : ");
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int arr[]= new int[N];
		System.out.println("Enter array elements : ");
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		
		//Logic for removing duplicates from a sorted array.
		int newN;
		int count = 0;
		int prevSame = -1;
		for(int i=0;i<N;i++) {
			if((i+1)<N && arr[i]==arr[i+1]) {
				prevSame = arr[i];
				continue;
			}
			else if(prevSame == arr[i]){
				prevSame = -1;
				continue;
			}
			else {
				arr[count++]=arr[i];
			}
		}
		
		//print array elements 
		for(int j =0;j<count;j++) {
			System.out.print(arr[j]+ " ");
		}
		
	}

}
