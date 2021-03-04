
public class SortArrayOf012Only {

	public static void main(String[] args) {
		int N = ArrayInput.getSize();
		int arr[] = new int[N];
		arr = ArrayInput.getInputArray(arr);

		//Method-1
		/*
		int count_of_0 = 0;
		int count_of_1 = 0;
		int count_of_2 = 0;
		
		for(int i=0;i<N;i++) {
			if(arr[i]==0) {
				count_of_0++;
			}
			else if(arr[i]==1) {
				count_of_1++;
			}
			else if(arr[i]==2) {
				count_of_2++;
			}
		}
		
		int count = 0;
		
		while(count_of_0>0) {
			arr[count++] = 0;
			count_of_0--;
		}
		
		while(count_of_1>0) {
			arr[count++] = 1;
			count_of_1--;
		}
		
		while(count_of_2>0) {
			arr[count++] = 2;
			count_of_2--;
		}
		
		for(int i=0;i<N;i++) {
			System.out.print(arr[i]+ " ");
		}
		
		*/
		
		//Method - 2
		//c0 represents all elements before c0 are 0.
		//c2 represents all elements after c2 are 2.
		int c0 = 0;
		int c2 = N-1;
		
		while(c0<N && arr[c0]==0) {
			c0++;
		}
		
		while(c2>=0 && arr[c2]==2) {
			c2--;
		}
		
		int i=c0;
		while(i<=c2) {
			if(arr[i]==1) {
				i++;
				continue;
			}
			else if(arr[i]==0) {
				//swap with c0
				int temp = arr[c0];
				arr[c0] = arr[i];
				arr[i] = temp;
				c0++;
			}
			else if(arr[i]==2) {
				//swap with c2
				int temp = arr[c2];
				arr[c2] = arr[i];
				arr[i] = temp;
				c2--;
			}
		}
		
		for(int j=0;j<N;j++) {
			System.out.print(arr[j]+ " ");
		}
		
	}

}
