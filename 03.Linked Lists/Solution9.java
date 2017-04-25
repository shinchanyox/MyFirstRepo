class Node
{
	 int  data ;
	 Node next ;
}
public class Solution9
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
	public static String check(Node start)
	{
		Node fast = start ;
		while(fast!=null && fast.next!=null)
			fast=fast.next.next ;
		if(fast==null)
			return "even" ;
		else //if(fast.next==null)
			return "odd" ;
	}
	public static void main(String s[])
	{
		Node start = null ;
		//start=addBegin(start,6);
		start=addBegin(start,5);
		start=addBegin(start,4);
		start=addBegin(start,3);
		start=addBegin(start,2);
		start=addBegin(start,1);
		print(start) ;
		System.out.println(check(start)) ;


	}


}
