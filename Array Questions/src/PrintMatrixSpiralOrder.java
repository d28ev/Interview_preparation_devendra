/*
 * Print matrix in spiral order
 * input : {
 * 			{1,2,3,4},
 * 			{5,6,7,8},
 * 			{9,10,11,12},
 * 			{13,14,15,16}
 * };
 * output : 1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10
 */
public class PrintMatrixSpiralOrder {

	public static void main(String[] args) {
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int rows = 0;
		int rowe = arr.length - 1;
		int cols = 0;
		int cole = arr[0].length -1;
		
		while(rows<=rowe && cols<=cole) {
		
		//print first row 
		for(int i=cols;i<=cole;i++) {
			System.out.print(arr[rows][i]+ ", ");
		}
		
		rows++;
		
		//print last column
		for(int j=rows;j<=rowe;j++) {
			System.out.print(arr[j][cole]+ ", ");
		}
		
		cole--;
		
		//print last row
		for(int i=cole;i>=cols;i--) {
			System.out.print(arr[rowe][i]+", ");
		}
		
		rowe--;
		
		//print first column
		for(int j=rowe;j>=rows;j--) {
			System.out.print(arr[j][cols]+", ");
		}
		
		cols++;
		
		}
		

	}

}
