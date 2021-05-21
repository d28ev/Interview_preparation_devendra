
public class SpiralOrderMatrix {

	public static void main(String[] args) {
		int[][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int row = mat.length;
		int col = mat[0].length;
		
		
		//first of all i will first row
		int i=0;
		int j=0;
		int j_end = col-1;
		int i_end = row-1;
		while(i<=i_end && j<=j_end) {
			for(int k=j;k<=j_end;k++) {
				System.out.print(mat[i][k]+ " ");
			}
			i++;
			for(int k=i;k<=i_end;k++) {
				System.out.print(mat[k][j_end]+ " ");
			}
			j_end--;
			for(int k=j_end;k>=j;k--) {
				System.out.print(mat[i_end][k]+ " ");
			}
			i_end--;
			for(int k=i_end;k>=i;k--) {
				System.out.print(mat[k][j]+ " ");
			}
			j++;
		}
		
		/*
		 * Time complexity : O(row*col)
		 * Space Complexity : O(1).
		 */
		
		

	}

}
