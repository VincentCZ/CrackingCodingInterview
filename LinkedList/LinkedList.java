package LinkedList;

public class LinkedList {
	public LinkedListNode head;
	public LinkedListNode mid;
	
	public static void print(LinkedListNode n) {

		System.out.print("List:");
		while(n != null) {
			System.out.print(String.format("%3d", n.data));
			if (n.next != null) {
				System.out.print("->");
			}
			n = n.next;	
		}
		System.out.println();
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
	
	public static LinkedListNode find(LinkedListNode head, int nodePoint) {
		LinkedListNode find = head;
		if(nodePoint < 1 || head == null) return null;
		for(int i = 1; i < nodePoint; i++) {
			if(find == null) return null;
			find = find.next;
		}
		return find;
	}

	public LinkedList(LinkedListNode node) {
		this.head = node;
	}
	
//	public LinkedList(Object[] object) {
//		this.head = new LinkedListNode(object[0]);
//		LinkedListNode current = this.head;
//		
//		int count = 1;
//		while(object[count] != null) {
//			current.next = new LinkedListNode(object[count]);
//			current = current.next;
//			count++;
//		}
//	}

	public LinkedList(int[] object) {
		this.head = new LinkedListNode(object[0]);
		LinkedListNode current = this.head;
		
		for(int i = 1; i < object.length; i++) {
			current.next = new LinkedListNode(object[i]);
			current = current.next;
		}
	}
	
	public boolean find(int nodePoint) {
		if (nodePoint < 1) return false;
		this.mid = this.head;
		for (int i = 2; i <= nodePoint; i++)
		{
			this.mid = this.mid.next;
			if(this.mid == null) {
				return false;
			}
		}
		return true;
	}
	
	public boolean delete(int nodePoint) {
		if (nodePoint < 1) return false;
		if (nodePoint == 1) {
			this.head = this.head.next;
			this.mid = this.head;
			return true;
		}
		this.mid = this.head;
		for(int i = 2; i <= nodePoint; i++) {
			if (this.mid.next == null) return false;
			if (i == nodePoint) {
				this.mid.next = this.mid.next.next;
			}
			this.mid = this.mid.next;
		}		
		return true;		
	}
		
	public String toString() {
		if(this.head == null) return null;
		LinkedListNode node = this.head;
		String str = "" + this.head;
		while(node.next != null) {
			str += "-> " + String.format("%3s", node.next);
			node = node.next;
		}
		return str;
	}
	
}
