
class LLNode{
	int data;
	LLNode next;
	
	public LLNode(int data) {
		this.data =data;
		this.next = null;
	}
}

public class LoopInLL {

	public static void main(String[] args) {
		LLNode head = new LLNode(30);
		LLNode node25 = new LLNode(25);
		LLNode node20 = new LLNode(20);
		LLNode node15 = new LLNode(15);
		LLNode node10 = new LLNode(10);
		LLNode node5 = new LLNode(5);
		head.next = node25;
		head.next.next = node20;
		head.next.next.next = node15;
		head.next.next.next.next = node10;
		head.next.next.next.next.next = node5;
		
		//loop
		node5.next = node15;
		
		//print linked list
		//printLL(head);
		
		//find loop
		LLNode slow=head, fast=head;
		slow = slow.next;
		if(fast.next == null) {
			//list has only one node
			return;
		}
		fast = fast.next.next;
		while(fast != null && fast.next!= null) {
			if(slow == fast) {
				System.out.println("Loop found");
				break;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		
		
		//find starting point of loop
		LLNode ptr1 = head;
		LLNode ptr2 = slow;
		
		while(ptr1 != ptr2) {
			ptr1 = ptr1.next;
			ptr2 = ptr2.next;
		}
		
		System.out.print("Starting loop node : "+ ptr1.data);
		
	}
	
	public static void printLL(LLNode head) {
		if(head == null) {
			return;
		}
		
		System.out.print(head.data + " ");
		printLL(head.next);
	}

}
