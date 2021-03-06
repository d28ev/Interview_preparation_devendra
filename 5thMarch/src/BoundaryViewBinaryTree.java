import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Node{
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
			this.left = this.right = null;
		}
	}

public class BoundaryViewBinaryTree {
	
	public static void leftView(Node root, int level, Map<Integer, Integer> mp) {
		if(root == null) {
			return;
		}
		
		if(!mp.containsKey(level)) {
			mp.put(level, root.data);
			System.out.print(root.data + " ");
		}
		leftView(root.left, level+1, mp);
		
		//System.out.print(root.data + " ");
		leftView(root.right, level+1, mp);
	}
	
	public static void rightView(Node root, int level, Map<Integer, Integer> mp) {
		if(root == null) {
			return;
		}
		
			
			mp.put(level, root.data);
		
			rightView(root.left, level+1, mp);
		
		//System.out.print(root.data + " ");
			rightView(root.right, level+1, mp);
	}
	
	public static void topView(Node root, int hd, Map<Integer, Integer> mp) {
		if(root == null) {
			return;
		}
		
		if(!mp.containsKey(hd)) {
			mp.put(hd, root.data);
		}
			
		topView(root.left, hd-1, mp);
		topView(root.right, hd+1, mp);
	}
	
	public static void bottomView(Node root, int hd, Map<Integer, Integer> mp) {
		if(root == null) {
			return;
		}
		
		mp.put(hd, root.data);
			
		bottomView(root.left, hd-1, mp);
		bottomView(root.right, hd+1, mp);
	}
	
	public static void printLeftBoundaryNodesExceptLeaf(Node root) {
		if(root==null) {
			return;
		}
		
		if(root.left != null) {
			System.out.print(root.data + " ");
			printLeftBoundaryNodesExceptLeaf(root.left);
		}
		else if(root.right != null) {
			System.out.print(root.data + " ");
			printLeftBoundaryNodesExceptLeaf(root.right);
		}
	}
	
	public static void printRightBoundaryNodesExceptLeaf(Node root) {
		if(root==null) {
			return;
		}
		
		if(root.right != null) {
			printRightBoundaryNodesExceptLeaf(root.right);
			System.out.print(root.data + " ");
		}
		else if(root.left != null) {
			printRightBoundaryNodesExceptLeaf(root.left);
			System.out.print(root.data + " ");
		}
	}
	
	public static void printLeafNodes(Node root) {
		if(root == null) {
			return;
		}
		
		if(root.left == null && root.right == null) {
			System.out.print(root.data + " ");
			return;
		}
		
		if(root.left != null) {
			printLeafNodes(root.left);
		}
		if(root.right != null){
			printLeafNodes(root.right);
		}
		
	}
	
	public static void boundaryView(Node root) {
		if(root == null) {
			return;
		}
		
		//print left boundary nodes, except leaf node.
		printLeftBoundaryNodesExceptLeaf(root);
		
		//print all leaf nodes.
		printLeafNodes(root);
		
		//print right boundary nodes, except leaf node.
		printRightBoundaryNodesExceptLeaf(root.right);
	}
	
	
	
	public static void inorder(Node root) {
		if(root == null) {
			return;
		}
		
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(15);
		root.left.left = new Node(3);
		root.left.left.left = new Node(2);
		root.left.right = new Node(7);
		root.right.left = new Node(12);
		root.right.right = new Node(17);
		
		//inorder(root);
		
		int level = 0;
		Map<Integer, Integer> mp = new TreeMap<Integer, Integer>();
		boundaryView(root);
//		
//		for(Integer key : mp.keySet()) {
//			System.out.print(mp.get(key) + " ");
//		}
		

	}

}
