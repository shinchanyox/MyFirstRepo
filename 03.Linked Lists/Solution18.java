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
public class Solution18
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

    public static Node clone(Node start)
    {
		Map<Node,Node> map = new HashMap<Node,Node>() ;
		Node temp = start ;
		while(temp!=null)
		{
			map.put(temp,new Node(temp.data)) ;
			temp= temp.next ;
		}
		temp= start ;
		while(temp!=null)
		{
			Node x = map.get(temp) ;
			x.next = map.get(temp.next) ;
			temp=temp.next ;
		}
		return map.get(start) ;

	}





	public static void main(String s[])
	{
		Node start = null ;
		Node start1 =null ;
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
		start1 = clone(start) ;
		print(start1) ;


	}


}
