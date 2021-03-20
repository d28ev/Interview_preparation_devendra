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
		root.left = new TreeNode(10);
		root.right = new TreeNode(30);
		root.left.left = new TreeNode(5);
		root.left.right = new TreeNode(9);
		root.right.left = new TreeNode(11);
		root.right.right = new TreeNode(25);
		
		//print inorder traversal
		//inorder(root);
		
		//setNextPointer
		root.next = null;
		setNextPointer(root);
		
		//
		inorder(root);
	}
	
	public static void setNextPointer(TreeNode root) {
		if(root == null) {
			return;
		}
		
		if(root.left != null) {
			root.left.next = root.right;
			//System.out.println(root.left.data + "-> "+ root.right.data);
		}
		if(root.right != null) {
			if(root.next != null) {
				//System.out.println(root.right.data + "-> "+ root.next.left.data);
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
