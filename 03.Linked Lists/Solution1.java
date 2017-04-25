class Node
{
	 int  data ;
	 Node next ;
}
public class Solution1
{
	public static Node addBegin(Node start,int data)
	{
		Node temp = new Node();
		temp.data = data ;
		temp.next = start ;
		start= temp ;
		return start ; // value reflect karane ke liye bhej rahein hain as java is purely pass by value
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
	public static int nthNode(Node start,int n)
	{
		Node one= start;
		Node two = start ;
		for(int i=1;i<=n;i++)
			two=two.next ;
		while(two!=null)
		{
			two=two.next ;
			one =one.next ;
		}
		return one.data ;


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
		System.out.println(nthNode(start,5)) ;


	}


}
