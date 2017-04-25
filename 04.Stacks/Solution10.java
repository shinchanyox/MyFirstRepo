import java.util.* ;
class Solution10
{

	public static void sort(Stack<Integer> stack)
	{
		if(stack.empty())
			return ;
		else
		{
			int temp= stack.pop() ;
			sort(stack) ;
			insertSortedWay(stack,temp) ;
		}
	}
	public static void insertSortedWay(Stack<Integer> stack,int data)
	{
		if(stack.empty() || data > stack.peek())
		{
			stack.push(data) ;
			return ;
		}
		else
		{
			int temp = stack.pop() ;
			insertSortedWay(stack,data) ;
			stack.add(temp) ;
		}
	}
	public static void main(String s[])
	{
		Stack<Integer> stack = new Stack<Integer>() ;
		stack.push(3) ;
		stack.push(1);
		stack.push(2);
		stack.push(5);
		stack.push(4);
		System.out.println(stack) ;
		sort(stack) ;
		System.out.println(stack) ;

	}
}