
public class CuttingRod {

	public static void main(String[] args) {
		int len = 8;
		//int[] price = new int[] {0, 1  , 5 ,  8 ,  9 , 10 , 17 , 17,  20};
		int[] price = new int[] {0,3 ,  5 ,  8 ,  9 , 10 , 17 , 17 , 20};
		
		int[][] mat = new int[len+1][len+1];
		//when rod length 0 , set full column to 0
		for(int i=0;i<=len;i++) {
			mat[i][0] =0;
		}
		
		//fill first row
		for(int j=1;j<=len;j++) {
			mat[1][j]=j*price[1];
		}
		
		for(int i=2;i<=len;i++) {
			for(int j=1;j<=len;j++) {
				if(i>j) {
					mat[i][j]=mat[i-1][j];
				}
				else {
					mat[i][j] = Integer.max(mat[i-1][j], price[i]+mat[i][j-i]);
				}
			}
		}
		
		System.out.println("Maximum profit we can get is : "+ mat[len][len]);
		
		

	}

}
