package ChapterII;

import LinkedList.LinkedListNode;

public class Codes2_3 {
	/*
	 * 	2.3 Implement an algorithm to delete a node in the middle of a
	 * 		singly linked list, given only access to that node.
	 */
	public static boolean deleteNode(LinkedListNode n) {
		if ( n == null || n.next == null) {
			return false;
		}
		LinkedListNode next = n.next;
		n.data =next.data;
		n.next = next.next;
		return true;
	}
}
