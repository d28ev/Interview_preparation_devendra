import java.util.Scanner;

/*
 * Write code to remove duplicates in a sorted array
 * input : int arr[] = {2, 4,4, 5, 9, 10,10,20};
 * output : {2,5,9,20}
 */
public class RemoveDuplicate {
	
	public static void main(String[] args) {
		
		int N = ArrayInput.getSize();
		int arr[] = new int[N];
		arr = ArrayInput.getInputArray(arr);
		
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
