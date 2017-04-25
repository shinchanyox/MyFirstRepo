import java.util.*;
class QueueTwoStacks<T>
{
	Stack<Integer> s1 = new Stack<Integer>() ;
	Stack<Integer> s2 = new Stack<Integer>() ;
	public void enqueue(int data)
	{
		s1.push(data) ;
	}
	public int dequeue()
	{
		if(s2.empty())
		{
			while(!s1.empty())
				s2.push(s1.pop()) ;
		}
		return s2.pop() ;
	}
}

class Solution2
{

	public static void main(String s[])
	{
		QueueTwoStacks<Integer> queue = new QueueTwoStacks<Integer>() ;
		queue.enqueue(1) ;
		queue.enqueue(2) ;
		queue.enqueue(3) ;
		queue.enqueue(4) ;
		queue.enqueue(5) ;
		System.out.println(queue.dequeue()) ;
		queue.enqueue(6) ;
		queue.enqueue(7) ;
		System.out.println(queue.dequeue()) ;
		System.out.println(queue.dequeue()) ;
		System.out.println(queue.dequeue()) ;
		System.out.println(queue.dequeue()) ;
		System.out.println(queue.dequeue()) ;
		System.out.println(queue.dequeue()) ;
		System.out.println(queue.dequeue()) ;
	}
}