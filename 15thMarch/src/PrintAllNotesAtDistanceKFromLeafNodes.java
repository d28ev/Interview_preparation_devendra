import java.util.ArrayList;

class TreeNode{
	int data;
	TreeNode left, right;
	public TreeNode(int data) {
		this.data = data;
		this.left = this.right = null;
	}
}

public class PrintAllNotesAtDistanceKFromLeafNodes {
	static int dist = 0;
	public static void main(String[] args) {
		TreeNode root = new TreeNode(20);
		TreeNode node30 = new TreeNode(30);
		TreeNode node50 = new TreeNode(50);
		root.left = node30;
		root.right = node50;
		TreeNode node40 = new TreeNode(40);
		TreeNode node60 = new TreeNode(60);
		node30.left = node40;
		node30.right = node60;
		TreeNode node70 = new TreeNode(70);
		TreeNode node80 = new TreeNode(80);
		node50.left = node70;
		node50.right = node80;
		TreeNode node90 = new TreeNode(90);
		TreeNode node100 = new TreeNode(100);
		node40.left = node90;
		node40.right = node100;
		TreeNode node10 = new TreeNode(10);
		TreeNode node25 = new TreeNode(25);
		node70.left = node10;
		node70.right = node25;
		
		int k = 1;
		
		//inorder(root);
		
		ArrayList<TreeNode> nodesAtKDistance = new ArrayList<>();
		TreeNode[] temp = new TreeNode[20];
		int index = 0;
		printNodesAtKDistance(root, k, nodesAtKDistance, temp, index);
		System.out.println("Size is : "+ nodesAtKDistance.size());
		for(int i=0;i<nodesAtKDistance.size();i++) {
			System.out.print(nodesAtKDistance.get(i).data+ " ");
		}

	}
	
	public static void printNodesAtKDistance(TreeNode root, int k, ArrayList<TreeNode> nodesAtKDistance, TreeNode[] temp,int index) {
		if(root == null) {
			return;
		}
		
		if(root.left == null && root.right==null) {
			if(!nodesAtKDistance.contains(temp[index-k])) {
				nodesAtKDistance.add(temp[index-k]);
			}
			return;
		}
		
		temp[index] = root;
		printNodesAtKDistance(root.left, k, nodesAtKDistance, temp, index+1);
		printNodesAtKDistance(root.right, k, nodesAtKDistance, temp, index+1);
		
	}
	
	public static void inorder(TreeNode root) {
		if(root == null) {
			return;
		}
		
		inorder(root.left);
		System.out.print(root.data+ " ");
		inorder(root.right);
	}

}
