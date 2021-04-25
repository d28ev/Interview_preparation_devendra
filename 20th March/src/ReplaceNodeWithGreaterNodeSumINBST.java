//class TreeNode{
//	int data;
//	TreeNode left, right, next;
//	public TreeNode(int data) {
//		this.data = data;
//		this.left = this.right = this.next = null;
//	}
//}
public class ReplaceNodeWithGreaterNodeSumINBST {
	static int sum = 0;
	public static void main(String[] args) {
		TreeNode root = new TreeNode(50);
		root.left = new TreeNode(30);
		root.right = new TreeNode(70);
		root.left.left = new TreeNode(20);
		root.left.right = new TreeNode(40);
		root.right.left = new TreeNode(60);
		root.right.right = new TreeNode(80);
		
		inorder(root);
		
		System.out.println();
		updateTreeWithGreaterSumNode(root);
		
		inorder(root);

	}
	
	public static void updateTreeWithGreaterSumNode(TreeNode root) {
		if(root==null) return;
		
		
		
		updateTreeWithGreaterSumNode(root.right);
		int d = root.data;
		root.data += sum;
		sum += d;
		updateTreeWithGreaterSumNode(root.left);
		
	}
	
	public static void inorder(TreeNode root) {
		if(root == null) {
			return;
		}
		
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}

}
