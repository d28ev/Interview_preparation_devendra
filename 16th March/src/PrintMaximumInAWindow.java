import java.util.LinkedList;
import java.util.Queue;

public class PrintMaximumInAWindow {

	public static void main(String[] args) {
//		int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
//		int K = 3;
		
//		int[] arr = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
//		int K = 4 ;
		
		int[] arr = {4,5,6,1,2,3,10,1};
		int K=3;
		
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i=0;i<K;i++) {
			if(queue.isEmpty()) {
				queue.add(arr[i]);
			}
			else {
				while(!queue.isEmpty() && arr[i]>queue.peek()) {
					queue.poll();
				}
				queue.add(arr[i]);
			}
		}
		
		if(!queue.isEmpty())
			System.out.print(queue.peek()+" ");

		for(int i=K;i<arr.length;i++) {
			if(queue.size()==K) {
				queue.poll();
			}
			
			while(!queue.isEmpty() && arr[i]>queue.peek()) {
				queue.poll();
			}
			queue.add(arr[i]);
			
			System.out.print(queue.peek()+ " ");
		
		}
	}

}
