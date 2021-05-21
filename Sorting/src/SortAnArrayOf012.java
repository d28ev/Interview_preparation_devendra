
public class SortAnArrayOf012 {

	public static void main(String[] args) {
		int[] arr = {1,1,0,0,1,0,2,2,2,1,1,0,2,0};
		
		int len = arr.length;
		
		//Method - 2
		//usingCount(arr, len);
		
		//Method - 3 using swap logic.
		usingSwap(arr,len);
		
		
		for(int j=0;j<len;j++) {
			System.out.print(arr[j]+ " ");
		}

	}
	
	private static void usingCount(int[] arr, int len) {
		int c0=0,c1=0,c2=0;
		for(int i=0;i<len;i++) {
			if(arr[i]==0) c0++;
			else if(arr[i]==1) c1++;
			else if(arr[i]==2) c2++;
		}
		
		int index = 0;
		//step 1 : put 0 same as c0
		while(c0>0) {
			arr[index++] = 0;
			c0--;
		}
		
		//step 2 : put 1 same as c1
		while(c1>0) {
			arr[index++] = 1;
			c1--;
		}
		
		//step 3 : put 2 same as c2
		while(c2>0) {
			arr[index++] = 2;
			c2--;
		}
	}
	
	private static void usingSwap(int[] arr,int len) {
		int index_of_0 = 0;
		int index_of_2 = len-1;

		int i=0;
		while(i<=index_of_2) {
			if(arr[i]==0) {
				//swap with index_of_0
				int temp = arr[i];
				arr[i] = arr[index_of_0];
				arr[index_of_0] = temp;
				index_of_0++;
				i++;
			}
			else if(arr[i]==2) {
				//swap with index_of_2
				int temp = arr[i];
				arr[i] = arr[index_of_2];
				arr[index_of_2] = temp;
				index_of_2--;
			}
			else if(arr[i]==1) {
				i++;
			}
		}
	}

}
