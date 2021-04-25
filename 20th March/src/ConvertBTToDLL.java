class DLLNode{
	int data;
	DLLNode previous, next;
	public DLLNode(int data) {
		this.data = data;
		this.previous = this.next = null;
	}
	
}
public class ConvertBTToDLL {
	static DLLNode head=null;
	static DLLNode head1 = null;
	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(12);
		root.right = new TreeNode(15);
		root.left.left = new TreeNode(25);
		root.left.right = new TreeNode(30);
		root.right.left = new TreeNode(36);
		
		
		DLLNode middleNode = convertToDLL(root);
		
		
		DLLNode temp = head1;
		while(temp!=null) {
			System.out.print(temp.data+ " ");
			temp = temp.next;
		}
		
	}
	
	public static DLLNode convertToDLL(TreeNode root) {
		if(root==null) {
			return null;
		}
		
		DLLNode lNode = convertToDLL(root.left);
		
		DLLNode newNode = new DLLNode(root.data);
		if(head==null) {
			head1 = newNode;
			head = newNode;
		}
		else {
			head.next = newNode;
			newNode.previous = head;
			head = head.next;
		}
		
		DLLNode rNode = convertToDLL(root.right);
		
		
		return newNode;
	}

}
