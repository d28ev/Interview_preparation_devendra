
public class CheckIfBTIsBSTOrNot {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(15);
		root.left.left = new Node(3);
		root.left.left.left = new Node(2);
		root.left.right = new Node(7);
		root.right.left = new Node(12);
		root.right.right = new Node(17);
		
		System.out.print(isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
	}
	
	public static void inorder(Node root) {
		if(root == null) {
			return;
		}
		
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}
	
	public static boolean isBST(Node root, int min, int max) {
		if(root==null) {
			return true;
		}
		
		if(root.data > min && root.data < max) {
			return isBST(root.left, min, root.data) && isBST(root.right, root.data, max);
		}
		
		return false;
	}

}
