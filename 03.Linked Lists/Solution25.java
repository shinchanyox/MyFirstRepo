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
public class Solution25
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

	public static Node add(Node start1,Node start2)
	{
		Node start=new Node() ;
		Node current = start ;
		int sum =0;
		int carry=0 ;
		while(start1!=null && start2!=null)
		{
		    sum = start1.data + start2.data +carry;
			carry = sum/10 ;
			sum=sum%10 ;
			Node temp = new Node(sum) ;
			current.next = temp ;
			current = current.next ;
			start1=start1.next ;
			start2=start2.next ;
		}
		if(start1!=null)
		{
			if(carry!=0)
				current.next = add(start1,new Node(carry)) ;
			else
				current.next = start1 ;

		}
		else if(start2!=null)
		{
			if(carry!=0)
				current.next = add(start2,new Node(carry)) ;
			else
				current.next = start2 ;
		}
		else if(carry!=0)
			current.next = new Node(1) ;
		return start.next ;
	}



	public static void main(String s[])
	{
		Node start1 = null ;
		Node start2 =null ;
		Node start=null ;
		start1=addBegin(start1,3);
		start1=addBegin(start1,4);
		start1=addBegin(start1,3);
		start2=addBegin(start2,4);
		start2=addBegin(start2,6);
		start2=addBegin(start2,5);
		print(start1) ;
		print(start2) ;
		start=add(start1,start2) ;
		print(start) ;


	}


}
