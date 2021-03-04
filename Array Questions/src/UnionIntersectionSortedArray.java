
public class UnionIntersectionSortedArray {

	public static void main(String[] args) {
		int M = ArrayInput.getSize();
		int firstArray[] = new int[M];
		firstArray = ArrayInput.getInputArray(firstArray);
		
		int N = ArrayInput.getSize();
		int secondArray[] = new int[N];
		secondArray = ArrayInput.getInputArray(secondArray);
		
		//print array
		printArray(firstArray);
		printArray(secondArray);
		
		//union
		
		
		
		//intersection
		

	}
	
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println();
	}

}
