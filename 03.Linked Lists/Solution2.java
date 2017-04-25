class Node
{
	 int  data ;
	 Node next ;
}
public class Solution2
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
	public static Node nthNode(Node start,int n)
	{
		Node temp=null ;
		if(start==null)
			return null ;
		else
		{
			 temp=nthNode(start.next,n) ;
			count++ ;
			if(count==n)
				return start ;
		}
		return temp ;


	}
	public static void main(String s[])
	{
		Node start = null ;
		start=addBegin(start,1);
		start=addBegin(start,2);
		start=addBegin(start,3);
		start=addBegin(start,4);
		start=addBegin(start,5);
		start=addBegin(start,6);
		print(start) ;
		Node temp =null ;
		temp=nthNode(start,4) ;
		System.out.println(temp.data) ;


	}


}
