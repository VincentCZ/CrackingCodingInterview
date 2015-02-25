package ChapterII;

import java.util.Hashtable;

import LinkedList.LinkedListNode;

public class Codes2_1 {
	/* 
	 * 2.1	Write code to remove duplicates from an unsorted linked list.
	 * 		FOLLOW UPt
	 * 		How would you solve this problem if a temporary buffer is not allowed?
	 */	
	public static void deleteDups(LinkedListNode n) {
		Hashtable<Integer, Boolean> table = new Hashtable<Integer, Boolean>();
		LinkedListNode previous = null;
		
		while(n != null) {
			if (table.containsKey(n.data)) {
				previous.next = n.next;
			} else {
				table.put(n.data,true);
				previous = n;
			}
			n = n.next;
		}
	}
	/*	without buffer	 */
	public static void deleteDups2(LinkedListNode head) {
		if (head == null) return;
		
		LinkedListNode current = head;
		while (current != null) {
			LinkedListNode runner = current;
			while(runner.next != null) {
				if (runner.next.data == current.data) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
			current = current.next;
		}
	}

}
