
public class LongestCommonSubsequence {

	static int temp1 = 0;
	static int temp2 = 0;
	public static void main(String[] args) {
//		String X = "abcdgh";
//		String Y = "aedfhr";
		
//		String X = "aggtab";
//		String Y = "gxtxayb";
		
		String X = "abcdxyz";
		String Y = "xyzabcd";
		
//		int ans = getLongestCommonSubsequence(X,Y, 0, 0);
//		System.out.println(ans);
//		System.out.println("Temp is : "+ temp1 + " "+ temp2);
		
		//optimized approach
		int[][] mat = new int[X.length()+1][Y.length()+1];
		//initialize mat by -1
		for(int i=0;i<X.length();i++) {
			for(int j=0;j<Y.length();j++) {
				mat[i][j] = -1;
			}
		}
		
		int ans = getLongestCommonSubsequenceOptimized(X,Y,0,0, mat);
		System.out.println(ans);
		System.out.println("Temp is : "+ temp1 + " "+ temp2);

	}
	
	public static int getLongestCommonSubsequenceOptimized(String X, String Y, int i, int j, int[][] mat) {
		if(i>=X.length() || j>=Y.length())
			return 0;
		temp1++;
		if(mat[i][j] != -1) {
			return mat[i][j];
		}
		
		if(X.charAt(i) == Y.charAt(j)) {
			mat[i][j] = 1+getLongestCommonSubsequenceOptimized(X,Y,i+1,j+1,mat);
		}
		else {
			mat[i][j] = max(getLongestCommonSubsequenceOptimized(X,Y,i+1,j, mat), getLongestCommonSubsequenceOptimized(X,Y,i,j+1, mat));
		}
		temp2++;
		
		return mat[i][j];
	}
	
	public static int getLongestCommonSubsequence(String X, String Y, int i, int j) {
		if(i>=X.length() || j>=Y.length())
			return 0;
		
		int count;
		temp1++;
		if(X.charAt(i) == Y.charAt(j)) {
			count = 1+getLongestCommonSubsequence(X,Y,i+1,j+1);
		}
		else {
			count = max(getLongestCommonSubsequence(X,Y,i+1,j), getLongestCommonSubsequence(X,Y,i,j+1));
		}
		temp2++;
		
		return count;
	}
	
	public static int max(int a, int b) {
		return (a>b) ? a : b;
	}

}
