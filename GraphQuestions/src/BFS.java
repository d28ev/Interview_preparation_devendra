import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

 class BFS {

	class Graph{
		int v;
		LinkedList<Integer> adj[];
		
		
		Graph(int v){
			this.v = v;
			adj = new LinkedList[v];
			for(int i=0;i<v;i++) {
				adj[i] = new LinkedList<>();
			}
		}
		
		void addEdge(int start, int end) {
			adj[start].add(end);
		}
		
		void BFSMethod(int start) {
			boolean[] visited = new boolean[v];
			
			
			Queue<Integer> queue = new LinkedList<>();
			
			queue.add(start);
			visited[start] = true;
			while(!queue.isEmpty()) {
				int src = queue.poll();
				
				System.out.print(src+" ");
				Iterator<Integer> itr = adj[src].listIterator();
				while(itr.hasNext()) {
					int node = itr.next();
					if(!visited[node]) {
						visited[node] = true;
						queue.add(node);
					}
				}
			}
			
		}
		
	}
	public static void main(String[] args) {
		BFS bfs = new BFS();
		 Graph g = bfs.new Graph(4);
		 
	        g.addEdge(0, 1);
	        g.addEdge(0, 2);
	        g.addEdge(1, 2);
	        g.addEdge(2, 0);
	        g.addEdge(2, 3);
	        g.addEdge(3, 3);
	 
	        System.out.println("Following is Breadth First Traversal "+
	                           "(starting from vertex 2)");
	 
	        g.BFSMethod(2);
	}
}
