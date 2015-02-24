package LinkedList;
/*
 * 	http://www.educity.cn/java/120827.html
 */

public class LinkedListNode {
	public LinkedListNode previous;
	public LinkedListNode next;
	public int data;
	public long timestamp;
	
	public LinkedListNode(int data, LinkedListNode next, LinkedListNode previous)
	{
		this.data = data;
		this.next = next;
		this.previous = previous;
	}
	
	public LinkedListNode(int data)
	{
		this.data = data;
	}

	public void setNext(LinkedListNode more) {
		// TODO Auto-generated method stub
		this.next = more;
	}
	
	public void remove() 
	{
		previous.next = next;
		next.previous = previous;
	}
	
	public String toString() 
	{
		return String.valueOf(data);
	}

}
