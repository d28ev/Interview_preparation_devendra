
public class PrintMatrixZigZag {

	public static void main(String[] args) {
		int[][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		 
		boolean order = true;
		for(int sum=0;sum<mat.length;sum++) {
			if(order) {
				for(int i=0;i<=sum;i++) {
					System.out.print(mat[sum-i][i]+ " ");
				}
			}
			else {
				for(int i=0;i<=sum;i++) {
					System.out.print(mat[i][sum-i]+ " ");
				}
			}
			order = !order;
		}
		
		int j=1;
		int count = 0;
		for(int sum=(mat.length) ; sum<=2*(mat.length-1);sum++) {
			if(!order) {
				count = j;
				while(count<(mat.length)) {
					System.out.print(mat[count][sum-count]+ " ");
					count++;
				}
				j++;
			}
			else {
				count = j;
				while(count<(mat.length)) {
					System.out.print(mat[sum-count][count]+ " ");
					count++;
				}
				j++;
			}
			
			order = !order;
		}
		
		

	}

}
