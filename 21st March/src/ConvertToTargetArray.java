
public class ConvertToTargetArray {
	static int ans =0;
	public static void main(String[] args) {
		int[] target= {2,1};
		
		convertAllOddToEven(target);
		boolean alleven = true;
		boolean allZero = true;
		while(alleven == true) {
			allZero = true;
			alleven = true;
			for(int i=0;i<target.length;i++) {
				target[i] = target[i]/2;
				if(target[i]%2==1) {
					alleven = false;
				}
				if(target[i]!=0) {
					allZero = false;
				}
			}
			
			if(alleven==false) {
				convertAllOddToEven(target);
				alleven = true;
			}
			
			//if all are zero break;
			if(allZero==true) {
				break;
			}
			else
				ans++;
		}
		
		System.out.println("Ans is : "+ ans);
		

	}
	
	public static void convertAllOddToEven(int[] target) {
		for(int i=0;i<target.length;i++) {
			if(target[i]%2!=0) {
					target[i]--;
					ans++;
			}
		}
	}

}
