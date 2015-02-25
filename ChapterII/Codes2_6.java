package ChapterII;

import LinkedList.LinkedListNode;

public class Codes2_6 {
	/*
	 * 	2.6	Given a circular linked list, implement an algorithm
	 * 		which returns the node at the beginning of the loop.
	 */
	public static LinkedListNode FindBeginning(LinkedListNode head) {
		LinkedListNode slow = head;
		LinkedListNode fast = head;
		
		/* Find meeting point. This will be publicSize + loopSize steps into the
		 * Linked list.	*/
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				break;
			}
		}	
		
		/*	if fast is not null, slow also not null
		if (fast == null || fast.next == null) {
			return null;
		}
		/*
		 * 	slow cost slowSize to meet fast;
		 * 	fast cost 2x slowSize to meet slow;
		 * 	a circleSize is 2x slowSize - slowSize = slowSize;
		 * 	So slow cost a circleSize to reach meet place.
		 * 	when put slow back to start place:
		 * 	slow cost oneWaySize + bothRunSize reach meet place;
		 * 	fast cost singleRunSize + bothRunSize reach meet place;
		 * 	So after oneWaySize(singleRunSize), 
		 * 	slow & fast will meeting at loop point;
		 */
		slow = head;
		while (slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}
		return fast;
	}
}
