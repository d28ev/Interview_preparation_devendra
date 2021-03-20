class LLNode{
	int data;
	LLNode next;
	public LLNode(int data) {
		this.data = data;
		this.next = next;
	}
}
public class GetIntersectionPointOfTwoLinkedList {

	public static void main(String[] args) {
		LLNode head1 = new LLNode(3);
		head1.next = new LLNode(6);
		head1.next.next = new LLNode(9);
		head1.next.next.next = new LLNode(15);
		head1.next.next.next.next = new LLNode(30);
		
		LLNode head2 = new LLNode(10);
		head2.next = new LLNode(15);
		head2.next.next = new LLNode(30);
		
		int len1=0, len2=0;
		LLNode ptr1 = head1;
		LLNode ptr2 = head2;
		
		while(ptr1!=null) {
			len1++;
			ptr1 = ptr1.next;
		}
		
		while(ptr2!=null) {
			len2++;
			ptr2 = ptr2.next;
		}
		
		int diff = 0;
		if(len1>len2) {
			diff = len1 - len2;
			ptr1 = head1;
			for(int i=0;i<diff;i++) {
				ptr1 = ptr1.next;
			}
			ptr2 = head2;
			while(ptr1.next!=null && ptr2.next != null && ptr1.data != ptr2.data) {
				ptr1 = ptr1.next;
				ptr2 = ptr2.next;
			}
			
			System.out.println("Intersection Node is : "+ ptr1.data);
		}
		else {
			diff = len2 - len1;
			ptr2 = head2;
			for(int i=0;i<diff;i++) {
				ptr2 = ptr2.next;
			}
			ptr1 = head1;
			while(ptr1.next!=null && ptr2.next != null && ptr1.data != ptr2.data) {
				ptr1 = ptr1.next;
				ptr2 = ptr2.next;
			}
			
			System.out.println("Intersection Node is : "+ ptr1.data);
		}
		

	}

}
