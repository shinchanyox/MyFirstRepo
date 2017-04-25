import java.util.* ;
class MyStack
{
	Stack<Integer> main = new Stack<Integer>() ;
	Stack<Integer> minStack = new Stack<Integer>() ;

	public void push(int data)
	{
		main.push(data) ;

		if(minStack.empty() || data <= minStack.peek())
			minStack.push(data) ;
		else
			minStack.push(minStack.peek()) ;
	}
	public int pop()
	{
		//if(main.empty())
			//throw new Exception("Stack is empty") ;
		minStack.pop() ;
		return main.pop() ;
	}
	public int getMinimum()
	{
		return minStack.peek() ;
	}
}
class Solution4
{
	public static void main(String s[])
	{
		MyStack stack = new MyStack();
		stack.push(2);
		stack.push(6);
		stack.push(4);
		stack.push(1);
		stack.push(5);
		System.out.println(stack.getMinimum());
		stack.pop() ;
		System.out.println(stack.getMinimum());
		stack.pop() ;
		System.out.println(stack.getMinimum());
		stack.pop() ;
		System.out.println(stack.getMinimum());
		stack.pop() ;
		System.out.println(stack.getMinimum());
		stack.pop() ;
		System.out.println(stack.getMinimum());
	}
}