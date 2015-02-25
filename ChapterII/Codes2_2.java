package ChapterII;

import LinkedList.LinkedListNode;

public class Codes2_2 {
	/*
	 * 	2.2 Implement an algorithm to find the kth to last element of
	 * 	 a singly linked list.
	 */
	/*	Approach A:	Don't Return the Element	*/
	public static int nthToLast(LinkedListNode head, int k) {
		if (head == null) {
			return 0;
		}
		int i = nthToLast(head.next, k) + 1;
		if (i == k) {
			System.out.println(head.data);
		}
		return i;
	}
	/*	Approach C:	Create a Wrapper Class	*/	
	public static LinkedListNode nthToLastR2(LinkedListNode head, int k, IntWrapper i) {
		if (head == null) {
			return null;
		}
		LinkedListNode node = nthToLastR2(head.next, k, i);
		i.value = i.value + 1;
		if (i.value == k) {
			return head;
		}
		return node;
	}
	/*	2.3	solutions 3	*/
	public static LinkedListNode nthToLastR3(LinkedListNode head, int k) {
		if (k <= 0) return null;
		
		LinkedListNode p1 = head;
		LinkedListNode p2 = head;
		
		for (int i = 0; i < k-1; i++) {
			if (p2 == null) return null;
			p2 = p2.next;
		}
		if (p2 == null) return null;
		
		while (p2.next != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p1;
	}

}
