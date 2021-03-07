
class Node{
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
			this.left = this.right = null;
		}
	}

public class LCAOfBT {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(15);
		root.left.left = new Node(3);
		root.left.left.left = new Node(2);
		root.left.right = new Node(7);
		root.right.left = new Node(12);
		root.right.right = new Node(17);
		
		int k1=12, k2=17;
		System.out.print(lca(root, k1, k2).data);

	}
	
	public static Node lca(Node root, int k1, int k2) {
		if(root == null) {
			return null;
		}
		if(root.data >= k1 && root.data <= k2) {
			return root;
		}
		
		Node lnode = lca(root.left, k1, k2);
		Node rnode = lca(root.right, k1, k2);
		
		if(lnode != null && rnode != null) {
			return root;
		}
		
		return (lnode != null) ? lnode : rnode;
		
	}

}
