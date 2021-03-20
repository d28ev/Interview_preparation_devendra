
public class LCS {

	static int count= 0;
	public static void main(String[] args) {
		String X = "GeekforGeeks";
		String Y = "GeeksQuiz";
		
//		String X = "abcdxyz";
//		String Y = "xyzabcd";
		
		int[][] mat = new int[X.length()+1][Y.length()+1];
		//initialize mat by -1
		for(int i=0;i<X.length();i++) {
			for(int j=0;j<Y.length();j++) {
				mat[i][j] = -1;
			}
		}
		
		int lcs_length = getLCS(X, Y, 0, 0, mat);
		System.out.println("Longest common substring length is : "+ lcs_length);
		System.out.println("Count is : "+ count);
		
		lcsBottomUp(X, Y);
	}
	
	public static void lcsBottomUp(String X, String Y) {
		int[][] mat = new int[X.length()+1][Y.length()+1];
		
		for(int j=0;j<Y.length();j++) {
			if(X.charAt(0) == Y.charAt(j)) {
				mat[0][j] = 1;
			}
			else
				mat[0][j]=0;
		}
		
		for(int i=0;i<X.length();i++) {
			if(X.charAt(i) == Y.charAt(0))
				mat[i][0] = 1;
			else
				mat[i][0] = 0;
		}
		
		for(int i=1;i<X.length();i++) {
			for(int j=1;j<Y.length();j++) {
				if(X.charAt(i)==Y.charAt(j)) {
					mat[i][j]=max(1+mat[i-1][j-1],mat[i-1][j], mat[i][j-1]);
				}
				else
					mat[i][j] = max(mat[i-1][j], mat[i][j-1]);
			}
		}
		
		System.out.println("Ans is : "+ mat[X.length()-1][Y.length()-1]);
	}
	
	public static int getLCSBruteForce(String X, String Y, int i, int j) {
		//base case
		if(i>=X.length() || j>=Y.length())
			return 0;
		
		int temp;
		
		if(X.charAt(i) == Y.charAt(j)) {
			temp = max(1+getLCSBruteForce(X,Y,i+1, j+1), 
					getLCSBruteForce(X,Y,i+1,j),
					getLCSBruteForce(X,Y,i,j+1));
		}
		else {
			temp = max(getLCSBruteForce(X,Y,i+1,j),
					getLCSBruteForce(X,Y,i,j+1));
		}
		count++;
		return temp;
	}
	
	public static int getLCS(String X, String Y, int i, int j, int[][] mat) {
		//base case
		if(i>=X.length() || j>=Y.length())
			return 0;
		
		if(mat[i][j]!=-1)
			return mat[i][j];
		count++;
		if(X.charAt(i) == Y.charAt(j)) {
			mat[i][j] = max(1+getLCS(X,Y,i+1, j+1, mat), 
						getLCS(X,Y,i+1,j, mat),
						getLCS(X,Y,i,j+1, mat));
		}
		else {
			mat[i][j] = max(getLCS(X,Y,i+1,j, mat),
					getLCS(X,Y,i,j+1, mat));
		}
		
		return mat[i][j];
	}
	
	public static int max(int a , int b) {
		return (a>b)?a : b;
	}
	
	public static int max(int a, int b, int c) {
		if(a>=b && a>=c) {
			return a;
		}
		else if(b>=c && b>=a) {
			return b;
		}
		
		return c;
	}

}
