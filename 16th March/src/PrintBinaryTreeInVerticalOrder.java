import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class TreeNode{
	int data;
	TreeNode left, right;
	public TreeNode(int data) {
		this.data = data;
		this.left = this.right = null;
	}
}
public class PrintBinaryTreeInVerticalOrder {

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
		
		Map<Integer, ArrayList<TreeNode>> mp = new HashMap<>();
		printTreeInVerticalOrder(root, mp, 0);
		
		for(Integer key : mp.keySet()) {
			ArrayList<TreeNode> ls = mp.get(key);
			for(int i=0;i<ls.size();i++) {
				System.out.print(ls.get(i).data + " ");
			}
			
			System.out.println();
		}
		

	}
	
	public static void printTreeInVerticalOrder(TreeNode root, Map<Integer, ArrayList<TreeNode>> mp, int hd) {
		if(root==null) {
			return;
		}
		
		ArrayList<TreeNode> ls = mp.get(hd);
		if(ls!=null) {
			ls.add(root);
			mp.put(hd, ls);
		}
		else {
			ArrayList<TreeNode> ls1 = new ArrayList<>();
			ls1.add(root);
			mp.put(hd, ls1);
		}
		
		printTreeInVerticalOrder(root.left, mp, hd-1);
		printTreeInVerticalOrder(root.right, mp, hd+1);
		
	}

}
