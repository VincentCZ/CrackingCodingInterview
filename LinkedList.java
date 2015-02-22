
import java.util.Hashtable;

public class LinkedList {
	
	/* 
	 * 2.1	Write code to remove duplicates from an unsorted linked list.
	 * 		FOLLOW UPt
	 * 		How would you solve this problem if a temporary buffer is not allowed?
	 */	
	public static void deleteDups(LinkedListNode n) {
		Hashtable<Object, Boolean> table = new Hashtable<Object, Boolean>();
		LinkedListNode previous = null;
		
		while(n != null) {
			if (table.containsKey(n.object)) {
				previous.next = n.next;
			} else {
				table.put(n.object,true);
				previous = n;
			}
			n = n.next;
		}
	}
}
