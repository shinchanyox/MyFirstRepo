class Node
{
	 int  data ;
	 Node next ;
}
public class Solution12
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
		Node temp = null ;
		if(start==null)
			return null ;
		else if(start.next==null)
			return start ;
		else
		{
			temp = start.next ;
			start.next = start.next.next ;
			temp.next = start ;
			start = temp ;
			start.next.next=pairReverse(start.next.next);
			return start ;

		}


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
