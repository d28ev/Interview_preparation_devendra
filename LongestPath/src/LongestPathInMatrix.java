
public class LongestPathInMatrix {

	public static void main(String[] args) {
		int row,col;
		row = 4;
		col = 4;
		int[][] mat = {{1,2,3,4}, {2,2,3,4}, {3,2,3,4},{4,5,6,7}};
		int[][] cache = new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				cache[i][j] = -1;
			}
		}
		
		System.out.println(findLongestPath(mat, row, col, 0, 0, cache));

	}
	
	public static int findLongestPath(int[][] mat, int row, int col, int i, int j, int[][] cache) {
		//Base Case
		if(i==(row-1) && (j==col-1)) { //Very important to think about.
			return 1;
		}
		
		if(i<0 || j<0 || i>=row || j>=col) {
			return 0; // why we are returning zero? - not valid - length = 0
		}
		
		//we have already calculated the longest path starting from index i and j
		//which is store in cache-> just return it.
		if(cache[i][j]!=-1) {
			return cache[i][j];
		}
		
		int result = Integer.MIN_VALUE;
		//you can go in right direction
		if(((j+1) < col) && mat[i][j+1]>mat[i][j]) {
			result = Integer.max(result,1+findLongestPath(mat, row, col, i, j+1, cache));
		}
		
		//you can go in left direction
		if(((i+1) <row) && mat[i+1][j]>mat[i][j]) {
			result = Integer.max(result,1+findLongestPath(mat, row, col, i+1, j, cache));
		}
		
		//here you need to store the result in your cache memory.
		cache[i][j] = result;
		
		return cache[i][j];
	}
	
	/**
	 * There are two problems :
	 * 1. we are calling the same function for same i and j multiple times : Overlapping subproblem.
	 * 2. solution of bigger problem can be calculated from solution of smaller problem : optimal substructure.
	 * 
	 * If any problem is satisfying these two properties : then we can use Dynamic programming algorithm technique
	 * to solve the problem.
	 */

}
