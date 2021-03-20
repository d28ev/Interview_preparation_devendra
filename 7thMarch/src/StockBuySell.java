
public class StockBuySell {

	public static void main(String[] args) {
		int N = ArrayInput.getSize();
		int[] price = new int[N];
		price = ArrayInput.getInputArray(price);
		
		int k = 2; //number of maximum transactions to get max profit.
		
		/*
		 * profit[t][i] : denotes max profit by doing maximum t transactions upto day i.
		 * profit[t][i] = max(profit[t][i-1], max(price[i]-price[j]+profit[t-1][j]) where j =[0, i-1]
		 */

		int[][] profit = new int[k+1][N+1];
		
		//when 0 transaction
		for(int j=0;j<=N;j++) {
			profit[0][j] = 0;
		}
		
		//At day 0 we can not earn any profit.
		for(int i=0;i<=k;i++) {
			profit[i][0] = 0;
		}
		
		for(int t=1;t<=k;t++) {
			for(int i=1;i<N;i++) {
				int max_so_far = 0;
				for(int j=0;j<i;j++) {
					max_so_far = max(max_so_far, price[i]-price[j]+profit[t-1][j]);
				}
				
				profit[t][i] = max(profit[t][i-1], max_so_far);
			}
		}
		
		System.out.println("Maximum profit by doing k transaction is : "+ profit[k][N-1]);
	}
	
	public static int max(int a, int b) {
		if(a<b) {
			return b;
		}
		
		return a;
	}

}
