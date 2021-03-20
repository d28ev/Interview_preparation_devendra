import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class LRUCache {

	public static void main(String[] args) {
		int[] pageRequests = new int[] {1, 2, 3, 1,4,5};
		int cache_size = 4;
		
		Deque<Integer> queue = new LinkedList<Integer>();
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0;i<pageRequests.length;i++) {
			if(set.contains(pageRequests[i])) {
				queue.remove(pageRequests[i]);
				queue.addLast(pageRequests[i]);
			}
			else {
				if(queue.size() == cache_size) {
					int item = queue.removeFirst();
					set.remove(item);
				}
				queue.addLast(pageRequests[i]);
				set.add(pageRequests[i]);
			}
		}
		
		//print cache content
		Iterator<Integer> itr = queue.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

	}

}
