import java.util.* ;

public class Solution1
{
	public static boolean check(String s)
	{
		Stack<Character> stack = new Stack<Character>() ;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
				stack.push(s.charAt(i)) ;

			else if(s.charAt(i)==')')
			{
				if(stack.empty() || stack.pop()!='(')
					return false ;
			}
			else if(s.charAt(i)=='}')
			{
				if(stack.empty()||stack.pop()!='{')
					return false ;
			}
			else if(s.charAt(i)==']')
			{
				if(stack.empty()||stack.pop()!='[')
					return false ;
			}
		}
		if(stack.empty()==false)
			return false ;
		else
			return true ;
	}








	public static void main(String s[])
	{
		System.out.println(check(    "(a+b)+(c-d)"    ));
		System.out.println(check(   "((a+b)+(c-d)"    ));
		System.out.println(check(   "((a+b)+[c-d])"   ));
		System.out.println(check(   "((a+b)+[c-d]}"   ));
		System.out.println(check(   "() (() [()])"   ));
		System.out.println(check(   "((() (() [()]))"   ));




	}


}
