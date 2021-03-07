import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node{
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
			this.left = this.right = null;
		}
	}

public class ReverseLevelOrderTraversal {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(15);
		root.left.left = new Node(3);
		root.left.left.left = new Node(2);
		root.left.right = new Node(7);
		root.right.left = new Node(12);
		root.right.right = new Node(17);
		
		//level order traversal.
		//levelOrderTraversal(root);
		
		//reverse level order traversal.
		reverseLevelOrderTraversal(root);

	}
	
	public static void levelOrderTraversal(Node root) {
		if(root == null) {
			return;
		}
		
		Queue<Node> que = new LinkedList<>();
		que.add(root);
		
		while(!que.isEmpty()) {
			Node temp = que.poll();
			System.out.print(temp.data+ " ");
			if(temp.left != null) {
				que.add(temp.left);
			}
			
			if(temp.right != null) {
				que.add(temp.right);
			}
		}
	}
	
	public static void reverseLevelOrderTraversal(Node root) {
		if(root == null) {
			return;
		}
		
		Stack<Node> st = new Stack<>();
		Queue<Node> que = new LinkedList<>();
		que.add(root);
		
		while(!que.isEmpty()) {
			Node temp = que.poll();
			st.push(temp);
			if(temp.right != null) {
				que.add(temp.right);
			}
			
			if(temp.left != null) {
				que.add(temp.left);
			}
		}
		
		while(!st.isEmpty()) {
			System.out.print(st.pop().data+ " ");
		}
	}

}
