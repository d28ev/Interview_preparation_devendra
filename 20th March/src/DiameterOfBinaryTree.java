
public class DiameterOfBinaryTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(20);
		root.left = new TreeNode(30);
		root.right = new TreeNode(50);
		root.left.left = new TreeNode(40);
		root.left.left.right = new TreeNode(100);
		root.left.left.right.right = new TreeNode(19);
		root.left.left.right.right.right = new TreeNode(20);
		root.left.left.right.right.right.right = new TreeNode(21);
		root.left.left.left = new TreeNode(90);
		root.left.right = new TreeNode(60);
		root.left.right.right = new TreeNode(9);
		root.left.right.right.right = new TreeNode(10);
		root.left.right.right.right.right = new TreeNode(11);
		root.left.right.right.right.right.right = new TreeNode(12);
		root.right.left = new TreeNode(70);
		root.right.right = new TreeNode(80);
		root.right.right.right = new TreeNode(190);
		
		System.out.println("Diameter is :" + diameterBT(root));

	}
	
	public static int height(TreeNode root) {
		if(root==null) {
			return 0;
		}
		
		int lHeight = height(root.left);
		int rHeight = height(root.right);
		
		return 1+Integer.max(lHeight, rHeight);
	}
	
	public static int diameterBT(TreeNode root) {
		if(root==null)
			return 0;
		
		int lDiameter = diameterBT(root.left);
		int rDiameter = diameterBT(root.right);
		
		return Integer.max(height(root.left)+height(root.right)+1, Integer.max(lDiameter, rDiameter));
		
	}

}
