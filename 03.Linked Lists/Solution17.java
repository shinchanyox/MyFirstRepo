class Node
{
	 int  data ;
	 Node next ;
}
public class Solution17
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
	public static Node reverseK(Node start,int k)
	{
		int count =k ;

		Node head = null ;
		Node previous = null ;
		Node current = start ;
		Node temp = null ;
		while(current!=null)
		{
			Node t = current ;
			previous = null;
			count = k;
			while(current!=null && count-->0)
			{
				temp = current.next ;
				current.next = previous ;
				previous = current ;
				current = temp ;
			}
			if(head==null)
				start = previous ;
			else
			{
				head.next = previous ;
			}

			head = t ;


		}
		return start ;


	}







	public static void main(String s[])
	{
		Node start = null ;
		start=addBegin(start,10);
		start=addBegin(start,9);
		start=addBegin(start,8);
		start=addBegin(start,7);
		start=addBegin(start,6);
		start=addBegin(start,5);
		start=addBegin(start,4);
		start=addBegin(start,3);
		start=addBegin(start,2);
		start=addBegin(start,1);
		print(start) ;
		start = reverseK(start,4) ;
		print(start) ;


	}


}
