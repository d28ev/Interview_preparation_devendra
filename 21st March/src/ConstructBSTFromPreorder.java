class Node{
	int data;
	Node left, right;
	public Node(int data) {
		this.data = data;
		this.left = this.right = null;
	}
}
public class ConstructBSTFromPreorder {
	
	public static void main(String[] args) {
		int[] arr = new int[] {10, 5, 1, 7, 40, 50};

		Node root = constructTree(arr, 0, arr.length-1);
		
		inorder(root);
	}
	
	public static void inorder(Node root) {
		if(root==null)
			return;
		
		inorder(root.left);
		System.out.print(root.data+ " ");
		inorder(root.right);
	}
	
	public static int findIndexWhichIsGreaterThanLowIndexNode(int[] arr, int startIndex, int endIndex, int key) {
		for(int i=startIndex;i<=endIndex;i++) {
			if(arr[i]>key)
				return i;
		}
		
		return -1;
	}
	
	public static Node constructTree(int[] arr, int low, int high) {
		if(low>high) {
			return null;
		} 
		
		Node newNode = new Node(arr[low]);
		int index = findIndexWhichIsGreaterThanLowIndexNode(arr, low, high, arr[low]);
		if(index!=-1) {
			newNode.left = constructTree(arr, low+1, index-1);
			newNode.right = constructTree(arr, index, high);
			
		}
		
		return newNode;
	}

}
