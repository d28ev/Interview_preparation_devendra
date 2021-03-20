import java.util.Arrays;

public class BoxStacking {

	public static void main(String[] args) {
		int[][] mat = { {4, 6, 7}, {1, 2, 3}, {4, 5, 6}, {10, 12, 32}};
		
		int[] l = new int[mat.length*6];
		int[] w = new int[mat.length*6];
		int[] h = new int[mat.length*6];
		int count = 0;
		for(int i=0;i<mat.length;i++) {
			int[] box = mat[i];
			l[count] = box[0];
			w[count] = box[1];
			h[count] = box[2];
			
			count++;
			l[count] = box[0];
			w[count] = box[2];
			h[count] = box[1];
			
			count++;
			l[count] = box[1];
			w[count] = box[0];
			h[count] = box[2];
			
			count++;
			l[count] = box[1];
			w[count] = box[2];
			h[count] = box[0];
			
			count++;
			l[count] = box[2];
			w[count] = box[0];
			h[count] = box[1];
			
			count++;
			l[count] = box[2];
			w[count] = box[1];
			h[count] = box[0];
			count++;
		}
		
		for(int i=0;i<count;i++) {
			System.out.println(l[i]+ " "+ w[i]+ " "+ h[i]);
		}
		
		

	}

}
