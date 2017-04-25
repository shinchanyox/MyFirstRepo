import java.util.* ;
class Solution8
{

	public static void reverse(Stack<Integer> stack)
	{
		if(stack.empty())
			return ;
		else
		{
			int temp = stack.pop() ;
			reverse(stack) ;
			insertAtBottom(stack,temp) ;
		}

	}
	public static void insertAtBottom(Stack<Integer> stack,int data)
	{
		if(stack.empty())
		{
			stack.push(data) ;
			return ;
		}
		else
		{
			int temp = stack.pop() ;
			insertAtBottom(stack,data) ;
			stack.add(temp) ;

		}
	}
	public static void main(String s[])
	{
		Stack<Integer> stack = new Stack<Integer>() ;
		stack.push(5) ;
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);
		System.out.println(stack) ;
		reverse(stack) ;
		System.out.println(stack) ;
	}
}