package LinkedList;

public class LinkedList {
	public static void print(LinkedListNode n) {
		int i = 0;
		
		while(n != null) {
			System.out.println("Node " + String.valueOf(++i) + ": " + n.toString());
//			System.out.println(n);
			n = n.next;
		}				
	}
	
	public static LinkedListNode create(Object[] object) {
		LinkedListNode head = new LinkedListNode(object[0]);
		LinkedListNode current = head;

		for(int i = 1; i < object.length; i++) {
			current.next = new LinkedListNode(object[i]);
			current = current.next;
		}
		return head;		
	}	
	
	public static LinkedListNode create(int[] integer) {
		LinkedListNode head = new LinkedListNode(integer[0]);
		LinkedListNode current = head;
		
		for(int i = 1; i < integer.length; i++) {
			current.next = new LinkedListNode(integer[i]);
			current = current.next;
		}
		return head;		
	}
}
