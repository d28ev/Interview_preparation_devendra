
class LLNode{
	int data;
	LLNode next;
	public LLNode(int data) {
		this.data = data;
		this.next = null;
	}
}
public class MergeSortForLinkedList {

	public static void main(String[] args) {
		LLNode head = new LLNode(40);
		head.next = new LLNode(20);
		head.next.next = new LLNode(60);
		head.next.next.next = new LLNode(10);
		head.next.next.next.next = new LLNode(50);
		head.next.next.next.next.next = new LLNode(30);
		//printLL(head);
		LLNode ans = mergeSort(head);
		
		//print linked list
		printLL(ans);
		

	}
	
	public static void printLL(LLNode ans) {
		LLNode ptr = ans;
		while(ptr!=null) {
			System.out.print(ptr.data + " ");
			ptr = ptr.next;
		}
	}
	
	public static LLNode mergeSortedLinked(LLNode first, LLNode second){
		if(first==null)
			return second;
		if(second==null)
			return first;
		LLNode newList=null;
		LLNode newListHead = null;
		while(first != null && second != null) {
			if(first.data < second.data) {
				if(newList==null) {
					newList = new LLNode(first.data);
					newListHead = newList;
					first = first.next;
				}
				else {
					newList.next = new LLNode(first.data);
					first = first.next;
					newList = newList.next;
				}
			}
			else {
				if(newList==null) {
					newList = new LLNode(second.data);
					newListHead = newList;
					second = second.next;
				}
				else {
					newList.next = new LLNode(second.data);
					second = second.next;
					newList = newList.next;
				}
			}
		}
		
		while(first!=null) {
			if(newList==null) {
				newList = new LLNode(first.data);
				newListHead = newList;
				first = first.next;
			}
			else {
				newList.next = new LLNode(first.data);
				first = first.next;
				newList = newList.next;
			}
		}
		
		while(second!=null) {
			if(newList==null) {
				newList = new LLNode(second.data);
				newListHead = newList;
				second = second.next;
			}
			else {
				newList.next = new LLNode(second.data);
				second = second.next;
				newList = newList.next;
			}
		}
		
		return newListHead;
		
	}
	
	public static LLNode mergeSort(LLNode head) {
		if(head==null || head.next == null) {
			return head;
		}
		LLNode first = head;
		LLNode second = null;
		
		LLNode previous = null;
		LLNode slow = head;
		LLNode fast = head;
		while(fast!=null && fast.next!=null) {
			previous = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		previous.next = null;
		second = slow;
		
		LLNode firstList = mergeSort(first);
		LLNode secondList = mergeSort(second);
		LLNode firstMerge = mergeSortedLinked(firstList, secondList);
		return firstMerge;
	}

}
