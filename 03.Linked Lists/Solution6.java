class Node
{
	 int  data ;
	 Node next ;
}
public class Solution6
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
	public static Node intersectionPoint(Node a,Node b)
	{
			    Node l1 =a;
			    Node l2=b;
			    int c1=0;
			    int c2=0;
			    int result =0 ;
			    while(l1!=null)
			    {
			        c1++ ;
			        l1=l1.next ;
			    }
			    while(l2!=null)
			    {
			        c2++ ;
			        l2=l2.next ;
			    }
			    if(c1>c2)
			    {
			        l1=a;
			        l2=b;
			        result = c1-c2 ;
			    }
			    else
			    {
			        l1=b;
			        l2=a;
			        result=c2-c1 ;
			    }
			    for(int i=1;i<=result;i++)
			        l1=l1.next ;
			    while(l1!=null&&l2!=null)
			    {
			        if(l1==l2)
			            return l1 ;
			        l1=l1.next ;
			        l2=l2.next ;
			    }
			    return null ;


	}

	public static void main(String s[])
	{
		Node start = null ;
		start=addBegin(start,6);
		start=addBegin(start,5);
		start=addBegin(start,4);
		start=addBegin(start,3);
		start=addBegin(start,2);
		start=addBegin(start,1);
		print(start) ;
		//start=intersectionPoint(l1,l2) ;
		//print(start) ;


	}


}
