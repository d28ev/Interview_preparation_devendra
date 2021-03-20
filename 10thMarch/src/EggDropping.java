
public class EggDropping {

	public static void main(String[] args) {
		int egg=2;
		int floor = 9;
		int[][] ans = new int[egg+1][floor+1];
		
		//initialize matrix with -1
		for(int i=0;i<=egg;i++) {
			for(int j=0;j<=floor;j++) {
				ans[i][j] = -1;
			}
		}
		
		
		
		System.out.println(findMinimumNumberOfTrials(egg, floor, ans));

	}
	
	public static int findMinimumNumberOfTrials(int egg, int floor, int[][] ans) {
		//System.out.println(egg+ " "+ floor);
		if(egg==1) {
			ans[egg][floor]=floor;
			return floor;
			}
		
		if(floor == 0 || floor == 1) {
			ans[egg][floor] = floor;
			return floor;
		}
		
		if(ans[egg][floor]!=-1) {
			return ans[egg][floor];
		}
		
		int min_trials = Integer.MAX_VALUE;
		
		for(int i=1;i<=floor;i++) {
			int res = 1+max(findMinimumNumberOfTrials(egg-1, i-1, ans), findMinimumNumberOfTrials(egg, floor-i, ans));
			
			if(res < min_trials) {
				min_trials = res;
			}
		}
		ans[egg][floor]=min_trials;
			
		return ans[egg][floor];
	}
	
	public static int max(int a, int b) {
		if(a>b)
			return a;
		return b;
	}

}
