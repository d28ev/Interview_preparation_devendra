
public class SudokuSolve {

	public static void main(String[] args) {
//		int[][] grid = { {3, 0, 6, 5, 0, 8, 4, 0, 0}, 
//		         {5, 2, 0, 0, 0, 0, 0, 0, 0}, 
//		         {0, 8, 7, 0, 0, 0, 0, 3, 1}, 
//		         {0, 0, 3, 0, 1, 0, 0, 8, 0}, 
//		         {9, 0, 0, 8, 6, 3, 0, 0, 5}, 
//		         {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
//		         {1, 3, 0, 0, 0, 0, 2, 5, 0}, 
//		         {0, 0, 0, 0, 0, 0, 0, 7, 4}, 
//		         {0, 0, 5, 2, 0, 6, 3, 0, 0} };
		
		int[][] grid = { { 3, 1, 6, 5, 7, 8, 4, 9, 2 },
		         { 5, 2, 9, 1, 3, 4, 7, 6, 8 },
		         { 4, 8, 7, 6, 2, 9, 5, 3, 1 },
		         { 2, 6, 3, 0, 1, 5, 9, 8, 7 },
		         { 9, 7, 4, 8, 6, 0, 1, 2, 5 },
		         { 8, 5, 1, 7, 9, 2, 6, 4, 3 },
		         { 1, 3, 8, 0, 4, 7, 2, 0, 6 },
		         { 6, 9, 2, 3, 5, 1, 8, 7, 4 },
		         { 7, 4, 5, 0, 8, 6, 3, 1, 0 } };

		
		solveSudoku(grid);
		
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				System.out.print(grid[i][j]+ " ");
			}
			System.out.println();
		}

	}
	
	public static boolean solveSudoku(int[][] grid) {
		//Base case, when all are non-zero
		boolean allNonZero = true;
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				if(grid[i][j]==0) {
					allNonZero = false;
				}
			}
		}
		
		if(allNonZero) {
			return true;
		}
		
		//find empty grid
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				if(grid[i][j]==0) {
					for(int k=1;k<=9;k++) {
						if(isValidK(grid, i, j, k)) {
							grid[i][j]=k;
							//System.out.println("i, j : "+ i+", "+j+ " -> "+ k);
							if(solveSudoku(grid))
								return true;
							else
								grid[i][j]=0;
							//System.out.println("i, j : "+ i+", "+j+ " -> "+ 0);
						}
					}
					return false;
				}
			}
		}
		
		return true;
		
	}
	
	public static boolean isValidK(int[][] grid, int i, int j, int value) {
		//check for same row
		for(int k=0;k<9;k++) {
			if(grid[i][k]==value) {
				return false;
			}
		}
		
		//check for same column
		for(int k=0;k<9;k++) {
			if(grid[k][j]==value) {
				return false;
			}
		}
		
		//check for 3*3 matrix
		int i_start=0, i_end=0;
		int j_start=0, j_end=0;
		if(i>=0 && i<=2) {
			i_start = 0;
			i_end = 2;
		}
		else if(i>=3 && i<=5) {
			i_start = 3;
			i_end = 5;
		}
		else if(i>=6 && i<=8) {
			i_start = 6;
			i_end = 8;
		}
		
		if(j>=0 && j<=2) {
			j_start = 0;
			j_end = 2;
		}
		else if(j>=3 && j<=5) {
			j_start = 3;
			j_end = 5;
		}
		else if(j>=6 && j<=8) {
			j_start = 6;
			j_end = 8;
		}
		
		for(int m=i_start;m<=i_end;m++) {
			for(int n=j_start;n<=j_end;n++) {
				if(grid[m][n]==value) {
					return false;
				}
			}
		}
		
		return true;
	}

}
