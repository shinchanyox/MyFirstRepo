import java.util.* ;

public class Solution2
{
	public static int priority(char c)
	{
		if(c=='$')
			return 3 ;
		else if(c=='*' || c=='/')
			return 2 ;
		else if(c=='+'||c=='-')
			return 1 ;
		else
			return 0 ;     //operand
	}
	public static String itpo(String s)
	{
		Stack<Character> stack = new Stack<Character>() ;
		StringBuffer sb = new StringBuffer() ;
		StringBuffer temp = new StringBuffer(s) ;
		temp.append(')');
		stack.push('(') ;
		int i=0 ;
		while(stack.empty()==false)
		{
			char c = temp.charAt(i++)  ;
			int p = priority(c) ;
			if(c=='(')
			{
				stack.push('(') ;
			}
			else if(c==')')
			{
				while(stack.peek()!='(')
					sb.append(stack.pop()) ;
				stack.pop() ;
			}
			else if(p==0)
				sb.append(c) ;
			else //operator
			{

					while(priority(stack.peek())>=p)
						sb.append(stack.pop()) ;
					stack.push(c) ;

			}

		}
		return sb.toString() ;
	}





	public static void main(String s[])
	{
		System.out.println(itpo("a+b")) ;
		System.out.println(itpo("4$2*3-3+8/4/(1+1)")) ;
		System.out.println(itpo("a*b-(c+d)+e")) ;
	}


}
