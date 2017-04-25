class Node
{
	 int  data ;
	 Node next ;
}
public class Solution5
{
	static int count ;
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
	public static Node reverse(Node previous,Node current)
	{
		Node start =null ;
		if(current==null)
		{
			return previous ;
		}
		else
		{
			start=reverse(current,current.next) ;
			current.next=previous ;
		}
		return start ;
	}

	public static void main(String s[])
	{
		Node start = null ;
		start=addBegin(start,6);
		start=addBegin(start,5);
		start=addBegin(start,4);
		start=addBegin(start,3);
		start=addBegin(start,2);
		start=addBegin(start,1);
		print(start) ;
		start=reverse(null,start) ;
		print(start) ;


	}


}
