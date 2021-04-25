class TreeNode{
	int data;
	TreeNode left, right, next;
	public TreeNode(int data) {
		this.data = data;
		this.left = this.right = this.next = null;
	}
}

public class MarkNextPointerAsNextNodeOfSameLevel {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(20);
		root.left = new TreeNode(30);
		root.right = new TreeNode(50);
		root.left.left = new TreeNode(90);
		root.left.left.left = new TreeNode(100);
		root.left.right = new TreeNode(130);
		root.right.left = new TreeNode(500);
		root.right.right = new TreeNode(900);
		root.right.right.right = new TreeNode(190);
		
		//print inorder traversal
		//inorder(root);
		
		//setNextPointer
		root.next = null;
		setNextPointer(root);
		
		//
		inorder(root);
	}
	
	/*
	 * Note : this approach will not work for not complete tree.
	 */
	public static void setNextPointer(TreeNode root) {
		if(root == null) {
			return;
		}
		
		if(root.left != null) {
			if(root.right!=null) {
				root.left.next = root.right;
			}
			else {
				root.left.next = null;
			}		
		}
		if(root.right != null) {
			if(root.next != null) {
				root.right.next = root.next.left;
			}
			else
				root.right.next = null;		
		}
		
		setNextPointer(root.left);
		setNextPointer(root.right);
		
	}
	
	public static void inorder(TreeNode root) {
		if(root == null)
			return;
		
		inorder(root.left);
		if(root.next==null)
			System.out.print(root.data+ "-> "+ root.next);
		else
			System.out.print(root.data+ "-> "+ root.next.data);
		
		System.out.println();
		inorder(root.right);
	}
	

}
