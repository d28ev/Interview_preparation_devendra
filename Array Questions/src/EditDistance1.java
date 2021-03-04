
public class EditDistance1 {

	public static void main(String[] args) {
//		String str1 = "geek";
//		String str2 = "gesek";
		
		String str1 = "cat";
		String str2 = "cut";
		
//		String str1 = "sunday";
//		String str2 = "saturday";
		
		int n = str1.length();
		int m = str2.length();
		int mat[][] = new int[n+1][m+1];
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=m;j++) {
				mat[i][j] = -1;
			}
		}
		findMinOperations(str1, str2, n, m, mat);
		System.out.println(mat[n][m]);
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				System.out.print(mat[i][j]+ " ");
			}
			System.out.println();
		}

	}
	
	public static int min(int x,int y, int z) {
		if(x < y && x< z) {
			return x;
		}
		else if(y<x && y<z) {
			return y;
		}
		
		return z;
	}
	
	public static int findMinOperations(String str1, String str2, int n, int m, int mat[][]) {
		if(n==0) {
			return m;
		}
		
		if(m==0) {
			return n;
		}
		
		if(mat[n][m] !=-1) {
			return mat[n][m];
		}
		
		if(str1.charAt(n-1) == str2.charAt(m-1)) {
			mat[n][m] = findMinOperations(str1, str2, n-1, m-1, mat);
			return mat[n][m];
		}
		
		mat[n][m] = 1+min(findMinOperations(str1, str2, n-1, m-1, mat),
				findMinOperations(str1, str2, n, m-1, mat),
				findMinOperations(str1, str2, n-1, m, mat));
		
		return mat[n][m];
				
	}

}
