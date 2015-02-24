
import java.util.Hashtable;

import LinkedList.LinkedListNode;

public class LinkedLists {
	
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
	/*
	 * 	2.4 Write code to partition a linked list around a value x, 
	 * 		such that all nodes less than x come before all nodes
	 * 		greater than or equal to x;
	 */
	public static LinkedListNode partition(LinkedListNode node, int x) {
		LinkedListNode beforeStart = null;
		LinkedListNode beforeEnd = null;
		LinkedListNode afterStart = null;
		LinkedListNode afterEnd = null;
		
		while (node != null) {
			LinkedListNode next = node.next;
			node.next = null;
			if(node.data < x) {
				if (beforeStart == null) {
					beforeStart = node;
					beforeEnd = beforeStart;
				} else {
					beforeEnd.next = node;
					beforeEnd = node;
				}				
			} else {
				if (afterStart == null) {
					afterStart = node;
					afterEnd = afterStart;
				} else {
					afterEnd.next = node;
					afterEnd = node;
				}
			}
			node = next;
		}
		
		if (beforeStart == null) {
			return afterStart;
		}
		
		beforeEnd.next = afterStart;
		return beforeStart;
	}
	/*	Second Solution	*/
	public static LinkedListNode partition2 (LinkedListNode node, int x) {
		LinkedListNode beforeStart = null;
		LinkedListNode afterStart = null;
		
		while (node != null) {
			LinkedListNode next = node.next;
			if(node.data < x) {
				node.next = beforeStart;
				beforeStart = node;
			} else {
				node.next = afterStart;
				afterStart = node;
			}
			node = next;
		}
		
		if (beforeStart == null) {
			return afterStart;
		}
		LinkedListNode head = beforeStart;
		while (beforeStart.next != null) {
			beforeStart = beforeStart.next;
		}
		beforeStart.next = afterStart;
		return head;
	}
	
}

