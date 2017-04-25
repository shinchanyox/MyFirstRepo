class Node
{
	 int  data ;
	 Node next ;
}
public class Solution13
{
	public static Node addBegin(Node start,int data)
	{
		Node temp = new Node();
		temp.data = data ;
		temp.next = start ;
		start= temp ;
		return start ;
	}
	public static void print(Node start)
	{
		while(start!=null)
		{
			System.out.print(start.next==null?start.data:start.data+" -> ") ;
			start=start.next ;
		}
		System.out.println() ;
	}
	public static Node pairReverse(Node start)
	{
		Node temp=null ;
		Node head = null ;
		while(start!=null && start.next!=null)
		{
			if(temp!=null)
				temp.next.next = start.next ;
			temp= start.next ;
			start.next = start.next.next ;
			temp.next = start ;
			if(head==null)
				head = temp ;
			start=start.next ;
		}
		return head ;

	}
	public static void main(String s[])
	{
		Node start = null ;
		start=addBegin(start,5);
		start=addBegin(start,4);
		start=addBegin(start,3);
		start=addBegin(start,2);
		start=addBegin(start,1);
		print(start) ;
		start = pairReverse(start) ;
		print(start) ;


	}


}
