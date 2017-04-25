class Node
{
	 int  data ;
	 Node next ;
}
public class Solution11
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
		Node start =null ;
		if(start1==null)
			return start2 ;
		else if(start2==null)
			return start1 ;
		else if(start1.data <=start2.data)
		{
			start = start1 ;
			start.next=merge(start1.next,start2) ;
		}
		else
		{
			start=start2 ;
			start.next=merge(start1,start2.next) ;
		}
		return start ;
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
