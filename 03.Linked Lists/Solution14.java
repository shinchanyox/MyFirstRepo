class Node
{
	 int  data ;
	 Node next ;
}
public class Solution14
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
	        Node previous =null ;
	        Node current = start ;
	        Node temp = null ;
	        while(current!=null)
	        {
	            temp= current.next ;
	            current.next = previous ;
	            previous=current ;
	            current=temp ;
	        }
	        return previous ;
	    }





	    public static boolean check(Node start1,Node start2)
	    {
	        if(start1==null || start2==null)
	            return false ;
	        while(start1!=null && start2!=null)
	        {
	            if(start1.data!=start2.data)
	            {
	                return false ;
	            }
	            start1=start1.next ;
	            start2=start2.next ;
	        }
	        if(start1==null && start2==null)
	            return true ;
	        else
	            return false ;
	    }


	    public static boolean palindrome(Node A) {
	        if(A.next==null)
	            return true ;
	        Node previous =null ;
	        boolean c = false ;
	        Node slow= A;
	        Node fast = A ;
	        while(fast!=null && fast.next!=null)
	        {
	            fast=fast.next.next ;
	            previous = slow ;
	            slow=slow.next ;
	        }
	        if(fast==null)//even case
	        {
	            previous.next=null ;
	            Node x = reverse(slow) ;
	            c=check(A,x) ;
	            x=reverse(x) ;
	            previous.next = x ;



	        }
	        else //odd case
	        {
	            previous.next =null ;
	            slow.next=reverse(slow.next) ;
	            c = check(A,slow.next) ;
	            slow.next=reverse(slow.next) ;
	            previous.next = slow ;

	        }
	        if(c==true)
	            return true ;
	        else
	            return false ;

    }
	public static void main(String s[])
	{
		Node start = null ;
		start=addBegin(start,0);
		start=addBegin(start,1);
		start=addBegin(start,2);
		start=addBegin(start,3);
		start=addBegin(start,2);
		start=addBegin(start,1);
		print(start) ;
		System.out.println(palindrome(start)) ;


	}


}
