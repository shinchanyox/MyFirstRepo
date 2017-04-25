import java.util.* ;

public class Solution3
{
	public static int priority(char c)
	{
		if(c=='$' || c=='/' || c=='+' || c=='-' || c=='*')
			return 1 ;
		else
			return 0 ;
	}

	public static int epo(String s)
	{
		Stack<Integer> stack = new Stack<Integer>() ;
		int z=0;
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i) ;
			int p = priority(c) ;
			if(p==0)
				stack.push(c-48) ; // operation between int and char results in an int
			else
			{
				int x =stack.pop() ;
				int y = stack.pop() ;

				if(c=='$')
					z=(int)Math.pow(y,x) ;
				else if(c=='*')
					z=y*x ;
				else if(c=='-')
					z=y- x;
				else if(c=='+')
					z=y+x ;
				else if(c=='/')
					z=y/x ;
				stack.push(z) ;

			}
		}
		return z ;
	}

	public static void main(String s[])
	{
		System.out.println(epo("123*+5-")) ;
		System.out.println(epo("42$3*3-84/11+/+"));
	}


}
