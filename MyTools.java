
public class MyTools {
		
	public static void printMatrix(int[][] matrix) {	
		/* int a[][] = new int[3][];
		 * a[0]=new int[2];
		 * a[1]=new int[3];
		 * a[2]=new int[4];
		 * int a[][] = new int[3][5];
		 */
		for(int line = 0; line < matrix.length; line++) {
			for(int column = 0; column < matrix[0].length; ++column) {
				System.out.print(String.format("%4s", matrix[line][column]));
			}
			System.out.println();
		}
		System.out.println("");
	}
	
	public static boolean isSubstring(String s1, String s2) {
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) == s2.charAt(count)) {
				++count;
			} else {
				count = 0;
			}
			if (count == s2.length()) return true;
			//if (count == s2.length()) return i-length+1;
		}
		return false;
		//return -1;
	}
	
	public static boolean isSubstring2(String s1, String s2) {
		return s1.indexOf(s2) > -1;
	}
	
	public static void printLinkedList(LinkedListNode n) {
		int i = 0;
		
		while(n != null) {
			System.out.println("Node " + String.valueOf(++i) + ": " + n.toString());
//			System.out.println(n);
			n = n.next;
		}				
	}
	
	public static LinkedListNode createLinkList(Object[] object) {
		LinkedListNode head = new LinkedListNode(object[0]);
		LinkedListNode current = head;

		for(int i = 1; i < object.length; i++) {
			current.next = new LinkedListNode(object[i]);
			current = current.next;
		}
		return head;		
	}	
	
	public static LinkedListNode createLinkList(int[] integer) {
		LinkedListNode head = new LinkedListNode(integer[0]);
		LinkedListNode current = head;
		
		for(int i = 1; i < integer.length; i++) {
			current.next = new LinkedListNode(integer[i]);
			current = current.next;
		}
		return head;		
	}

}
