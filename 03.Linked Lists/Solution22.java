import java.util.* ;
class Node
{
	 int  data ;
	 Node next ;
	 Node(int data)
	 {
		 this.data = data ;
	 }
	 Node(){}
}
public class Solution22
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

	public static Node reverse(Node start)
	{
		Node previous = null ;
		Node current = start ;
		Node temp=null ;
		while(current!=null)
		{
			temp = current.next ;
			current.next = previous ;
			previous = current ;
			current = temp ;
		}
		return previous ;
	}
	public static void merge(Node one,Node two)
	{
		Node head = new Node() ;
		Node current = head ;
		while(one!=null && two!=null)
		{
			current.next = one ;
			current = current.next ;
			one=one.next ;

			current.next = two ;
			current = current.next ;
			two=two.next ;
		}
		if(one==null)
			current.next = two ;
		else
			current.next=one ;



	}
   public static void reorder(Node start)
   {
	   Node one = start ;
	   Node two = null ;
	   Node slow = start ;
	   Node fast = start ;
	   Node prev = null ;
	   while(fast!=null && fast.next!=null)
	  {
		  prev = slow ;
		   fast=fast.next.next ;
		   slow=slow.next ;
	   }
	   if(fast==null) //even case
	   {
	   		two = slow ;
	   		prev.next =null ;
		}
	   	else //odd case
	   	{
	   		two= slow.next ;
	   		slow.next = null ;
	    }
		two=reverse(two) ;
	   	merge(one,two) ;

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
		reorder(start) ;
		print(start) ;


	}


}
