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

	public static Node insertionSort(Node start)
	{
		Node temp = start ;
		temp=temp.next ;
		while(temp!=null)
		{

		}
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
		start=insertionSort(start);
		print(start) ;


	}


}
