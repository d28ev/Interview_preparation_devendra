
public class SortedArrayToBST {

	public static void main(String[] args) {
		//int[] arr = {1,5,7,10,40,50};
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7}; 
		
		Node root = constructBalancedBST(arr, 0, arr.length-1);
		
		//inorder(root);
		
		preorder(root);

	}
	
	public static void preorder(Node root) {
		if(root==null)
			return;
		System.out.print(root.data+ " ");
		preorder(root.left);
		
		preorder(root.right);
	}
	
	public static void inorder(Node root) {
		if(root==null)
			return;
		
		inorder(root.left);
		System.out.print(root.data+ " ");
		inorder(root.right);
	}
	
	public static Node constructBalancedBST(int[] arr, int low, int high){
		if(low>high) {
			return null;
		}
		
		int mid = (low+high)/2;
		Node newNode = new Node(arr[mid]);
		newNode.left = constructBalancedBST(arr, low, mid-1);
		newNode.right = constructBalancedBST(arr, mid+1, high);
		
		return newNode;
	}

}
