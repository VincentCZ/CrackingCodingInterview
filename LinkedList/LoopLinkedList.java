package LinkedList;

public class LoopLinkedList {
	public LinkedListNode head;
	public LinkedListNode next;
	public LinkedListNode before;
	public LinkedListNode loopHead;
	public int loopNode;
	public int length;
	
	public LoopLinkedList(int[] arrays, int loopNode) {
		if (loopNode < 1 || loopNode > arrays.length) {
			loopNode = 1;
		} 
		
		this.head = new LinkedListNode(arrays[0], null, null);
		LinkedListNode current = this.head;
		
		if (loopNode == 1) {
			this.loopNode = 1;
			this.loopHead = this.head;
		}
		
		for (int i = 1; i < loopNode; i++) {
			current.next = new LinkedListNode(arrays[i], null, null);
			current = current.next;
		}
		this.loopNode = loopNode;
		this.loopHead = current;
		this.length = arrays.length;
		
		for (int i = loopNode; i < arrays.length; i++) {
			current.next = new LinkedListNode(arrays[i], null, null);
			current = current.next;
		}
		current.next = this.loopHead;
	}
	public String toString() {
		String str = "LoopList: ";
		LinkedListNode current = this.head;
		for (int i = 1; i <= this.length; i++) {
			if (i == this.loopNode) {
				str += " {";
			}
			str += String.format("%2s", current) + " ->";
			current = current.next;
		}
		str += "}";
		return str;
	}
}
