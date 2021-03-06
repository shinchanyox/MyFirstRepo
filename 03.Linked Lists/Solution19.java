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
public class Solution19
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

   public static int modular(Node start,int k)
   {
	   int count = 0 ;
	   int result = 0;
	   while(start!=null)
	   {
			if(++count % k==0)
				result = start.data ;
			start=start.next ;
	   }
	   return  result ;
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
		System.out.println(modular(start,3)) ;


	}


}
