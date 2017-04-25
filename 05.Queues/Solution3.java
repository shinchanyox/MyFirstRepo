import java.util.*;
class StackTwoQueues<T>
{
	Queue<Integer> q1 = new LinkedList<Integer>() ;
	Queue<Integer> q2 = new LinkedList<Integer>() ;

	public void push(int data)
	{
		if(q1.isEmpty())
			q2.offer(data) ;
		else    // pehli baar mei dono queue empty honge to q1 mei chala jaega
			q1.offer(data) ;
	}
	public int pop()
	{
		int s =0 ;
		if(q1.isEmpty())
		{
			s =q2.size() - 1 ;
			while(s-- > 0)
				q1.offer(q2.poll()) ;

			return q2.poll() ;
		}
		else
		{
			s= q1.size() - 1 ;
			while(s-- > 0)
				q2.offer(q1.poll()) ;

			return q1.poll() ;
		}
	}
}

class Solution3
{

	public static void main(String s[])
	{
		StackTwoQueues<Integer> stack = new StackTwoQueues<Integer>() ;
		stack.push(1) ;
		stack.push(2) ;
		stack.push(3) ;
		stack.push(4) ;
		stack.push(5) ;
		System.out.println(stack.pop()) ;
		stack.push(6) ;
		stack.push(7) ;
		System.out.println(stack.pop()) ;
		System.out.println(stack.pop()) ;
		System.out.println(stack.pop()) ;
		System.out.println(stack.pop()) ;
		System.out.println(stack.pop()) ;
		System.out.println(stack.pop()) ;
		System.out.println(stack.pop()) ;


	}
}