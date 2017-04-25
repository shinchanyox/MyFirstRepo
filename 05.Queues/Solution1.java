import java.util.*;
class Solution1
{
	public static void reverse(Queue<Integer> queue)
	{
		if(queue.isEmpty())
			return ;
		else
		{
			int temp = queue.poll() ;
			reverse(queue) ;
			queue.offer(temp);
		}
	}
	public static void main(String s[])
	{
		Queue<Integer> queue = new LinkedList<Integer>() ;
		queue.offer(1) ;
		queue.offer(2) ;
		queue.offer(3) ;
		queue.offer(4) ;
		queue.offer(5) ;
		System.out.println(queue);
		reverse(queue) ;
		System.out.println(queue) ;

	}
}