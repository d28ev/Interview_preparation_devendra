/*
 * Shift all zero to end of an array
 * intput : int arr[] = {2,3,0,4,0,5,0};
 * output : {2,3,4,5,0,0,0}
 */
public class ShiftingZero {

	public static void main(String[] args) {
		int N = ArrayInput.getSize();
		int arr[] = new int[N];
		arr = ArrayInput.getInputArray(arr);
		
		//Logic for shifting zeroes to end.
		int counter = 0;
		for(int i=0;i<N;i++) {
			if(arr[i] != 0) {
				arr[counter++]= arr[i];
			}
		}
		
		while(counter<N) {
			arr[counter++] = 0;
		}
		
		//print new modified array
		for(int i=0;i<N;i++) {
			System.out.print(arr[i]+ " ");
		}

	}

}
