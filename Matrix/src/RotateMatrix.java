
public class RotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		//Matrix before rotation
		printMatrix(mat, "Before rotation matrix is : ");
		
		//step 1 : just take tranpose
		transpose(mat);

		//Step 2 : just reverse each row
		reverseRow(mat);
		
		//Step 3 print the rotated matrix 
		printMatrix(mat, "After rotation matrix is : ");
	}
	
	private static void transpose(int[][] mat) {
		int row = mat.length;
		int col = mat[0].length;
		
		for(int i=0;i<row;i++) {
			for(int j=i+1;j<col;j++) {
				swap(mat,i,j);
			}
		}
	}
	
	private static void swap(int[][] mat, int i, int j) {
		int temp = mat[i][j];
		mat[i][j] = mat[j][i];
		mat[j][i] = temp;
	}
	
	private static void swap(int[][] mat, int i, int j, int a, int b) {
		int temp = mat[i][j];
		mat[i][j] = mat[a][b];
		mat[a][b] = temp;
	}
	
	private static void reverseRow(int[][] mat) {
		int row = mat.length;
		int col = mat[0].length;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col/2;j++) {
				swap(mat,i,j,i,col-1-j);
			}
		}
	}
	
	private static void printMatrix(int[][] mat, String message) {
		System.out.println(message);
		int row = mat.length;
		int col = mat[0].length;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(mat[i][j]+ " ");
			}
			
			System.out.println();
		}
	}

}
