class Node
{
	 int  data ;
	 Node next ;
}
public class Solution10
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
	public static Node merge(Node start1,Node start2)
	{
		Node start = new Node() ;
		Node current = start ;
		while(start1!=null&&start2!=null)
		{
			if(start1.data <=start2.data)
			{
				current.next = start1 ;
				current=current.next ;
				start1=start1.next ;
			}
			else
			{
				current.next = start2 ;
				current=current.next ;
				start2=start2.next ;
			}
		}
		if(start1==null)
			current.next = start2 ;
		else if(start2==null)
			current.next = start1 ;
		return start.next ;
	}

	public static void main(String s[])
	{
		Node start1 = null ;
		Node start2=null ;
		start1=addBegin(start1,9);
		start1=addBegin(start1,8);
		start1=addBegin(start1,7);
		start1=addBegin(start1,2);
		start1=addBegin(start1,1);
		start2=addBegin(start2,10);
		start2=addBegin(start2,6);
		start2=addBegin(start2,5);
		print(start1) ;
		print(start2) ;
		Node result = merge(start1,start2) ;
		print(result) ;


	}


}
