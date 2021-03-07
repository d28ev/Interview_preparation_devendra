
public class MininumCoinsToGetSum {

	public static void main(String[] args) {
		int N = ArrayInput.getSize();
		int[] arr = new int[N];
		arr = ArrayInput.getInputArray(arr);
		int sum = 11;
		
		int[][] ans = new int[N][sum+1];
		
		for(int i=0;i<N;i++) {
			ans[i][0] = 0;
		}
		
		for(int j=1;j<=sum;j++) {
			if(j%arr[0]==0) {
				ans[0][j] = j/arr[0];
			}
			else {
				ans[0][j] = 9999;
			}
			
		}
		
		for(int i=1;i<N;i++) {
			for(int j=1;j<=sum;j++) {
				if(j<arr[i]) {
					ans[i][j] = ans[i-1][j];
				}
				else {
					ans[i][j] = min(1+ans[i][j-arr[i]], ans[i-1][j]);
				}
			}
		}
		
		System.out.println(ans[N-1][sum]);
	}
	
	public static int min(int a, int b) {
		if(a>b) {
			return b;
		}
		else {
			return a;
		}
	}
}
