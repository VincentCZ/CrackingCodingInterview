
/*
 * 	http://www.educity.cn/java/120827.html
 */

public class LinkedListNode {
	public LinkedListNode previous;
	public LinkedListNode next;
	public Object object;
	public long timestamp;
	
	public LinkedListNode(Object object, LinkedListNode next, LinkedListNode previous)
	{
		this.object = object;
		this.next = next;
		this.previous = previous;
	}
	
	public LinkedListNode(Object object)
	{
		this.object = object;
	}
	
	public void remove() 
	{
		previous.next = next;
		next.previous = previous;
	}
	
	public String toString() 
	{
		return object.toString();
	}
	
}
