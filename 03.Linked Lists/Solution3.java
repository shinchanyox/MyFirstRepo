class Node
{
	 int  data ;
	 Node next ;
}
public class Solution3
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
	public static Node insert_sorted(Node start,int  data)
	{
		Node naya = new Node() ;
		naya.data = data ;
		Node current =start ;
		Node temp=null ;
		while(current!=null && current.data< data)
		{
			temp= current ;
			current = current.next ;
		}
		if(temp==null)
		{
			naya.next = start ;
			start = naya ;
		}
		else
		{
			naya.next = temp.next ;
			temp.next = naya ;
		}
		return start ;

	}

	public static void main(String s[])
	{
		Node start = null ;
		start=addBegin(start,6);
		start=addBegin(start,5);
		start=addBegin(start,3);
		start=addBegin(start,2);
		start=addBegin(start,1);
		print(start) ;
		start=insert_sorted(start,4) ;
		print(start) ;
		start=insert_sorted(start,0) ;
		print(start) ;
		start=insert_sorted(start,7) ;
		print(start) ;


	}


}
