class LLNode{
	int data;
	LLNode next, arbit;
	public LLNode(int data) {
		this.data = data;
		this.next = null;
		this.arbit = null;
	}
}

public class CloneLL {

	public static void main(String[] args) {
		LLNode head = new LLNode(1);
		LLNode second = new LLNode(2);
		LLNode third = new LLNode(3);
		LLNode fourth = new LLNode(4);
		LLNode five = new LLNode(5);
		LLNode six = new LLNode(6);
		
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = five;
		five.next = six;
		six.next = null;
		
		head.arbit = third;
		second.arbit = third;
		third.arbit = five;
		fourth.arbit = six;
		five.arbit = null;
		six.arbit = five;
		
		LLNode ptr = head;
		while(ptr != null) {
			System.out.print(ptr.data + " ");
			ptr = ptr.next;
		}
		System.out.println();
		ptr = head;
		while(ptr != null) {
			if(ptr.arbit!=null)
				System.out.println(ptr.data + " -> "+ ptr.arbit.data);
			ptr = ptr.next;
		}
		System.out.println();
		//copy the linked list
		ptr = head;
		while(ptr!=null) {
			LLNode newNode = new LLNode(ptr.data);
			LLNode temp = ptr.next;
			ptr.next = newNode;
			newNode.next = temp;
			
			ptr = temp;
		}
		
		ptr = head;
		while(ptr!=null) {
			if(ptr.next!=null && ptr.arbit!=null) {
				ptr.next.arbit = ptr.arbit.next;
			}
			else if(ptr.next!=null){
				ptr.next.arbit = null;
			}
			
			if(ptr.next!=null) {
				ptr= ptr.next.next;
			}
			else {
				ptr=null;
			}
		}
		
		LLNode copy_head = null;
		ptr = head;
		copy_head = ptr.next;
		while(ptr!=null) {
			if(ptr.next!=null) {
				LLNode temp= ptr.next;
				ptr.next = ptr.next.next;
				if(temp.next!=null)
					temp.next = temp.next.next;
				else
					temp.next = null;
				
				
			}
			
				ptr = ptr.next;
			
		}
		
		//copied linked list head node is : copy_head.
		

		ptr = copy_head;
		while(ptr != null) {
			System.out.print(ptr.data + " ");
			ptr = ptr.next;
		}
		
		System.out.println();
		ptr = copy_head;
		while(ptr != null) {
			if(ptr.arbit!=null)
				System.out.println(ptr.data + " -> "+ ptr.arbit.data);
			ptr = ptr.next;
		}
		System.out.println();

	}

}
