package ChapterII;

import LinkedList.LinkedListNode;

public class Codes2_5 {
	/*
	 * 	2.5	You have two numbers represented by a linked list, 
	 * 		where each node contains a single digit. The digits
	 * 		are stored in reverse order, such that the 1's digit
	 * 		is at the head of the list. Write a function that adds
	 * 		the two numbers and returns the sum asd a linked list.
	 */
	public static LinkedListNode addLists(LinkedListNode l1, LinkedListNode l2, int carry) {
		if (l1 == null && l2 == null && carry == 0) {
			return null;
		}
		
		LinkedListNode result = new LinkedListNode(carry, null, null);
		
		int value = carry;
		if (l1 != null) {
			value += l1.data;
		}
		if (l2 != null) {
			value += l2.data;
		}
		
		result.data = value % 10;
		
		if (l1 != null || l2 != null || value >= 10) {
			LinkedListNode more = addLists (l1 == null ? null : l1.next, 
											l2 == null ? null : l2.next,
											value >= 10 ? (int) value / 10 : 0);
			result.setNext(more);
		}
		return result;
	}
	
	public static LinkedListNode addLists2(LinkedListNode l1, LinkedListNode l2) {
		int len1 = length(l1);
		int len2 = length(l2);
		
		if (len1 < len2) {
			l1 = padList(l1, len2 - len1);
		} else {
			l2 = padList(l2, len1 - len2);
		}
		PartialSum sum = addListsHelper(l1, l2);
		
		if (sum.carry == 0) {
			return sum.sum;
		} else {
			LinkedListNode result = insertBefore(sum.sum, sum.carry);
			return result;
		}
	}
	
	static PartialSum addListsHelper(LinkedListNode l1, LinkedListNode l2) {
		if (l1 == null && l2 == null) {
			PartialSum sum = new PartialSum();
			return sum;
		}
		
		PartialSum sum = addListsHelper(l1.next, l2.next);
		
		int val = sum.carry + l1.data + l2.data;
		
		LinkedListNode full_result = insertBefore(sum.sum, val % 10);
		
		sum.sum = full_result;
		sum.carry = val /10;
		return sum;		
	}
	
	static LinkedListNode padList(LinkedListNode l, int padding) {
		LinkedListNode head = l;
		for (int i = 0; i < padding; i++) {
			LinkedListNode n = new LinkedListNode(0, null, null);
			head.previous = n;
			n.next = head;
			head = n;
		}
		return head;
	}
	
	static LinkedListNode insertBefore(LinkedListNode list, int data) {
		LinkedListNode node = new LinkedListNode(data, null, null);
		if (list != null) {
			list.previous = node;
			node.next = list;
		}
		return node;
	}
	
	static int length(LinkedListNode node) {
		if (node == null) return 0;
		int len = 1;
		while (node.next != null) {
			len++;
			node = node.next;
		}
		return len;
	}
	
}
