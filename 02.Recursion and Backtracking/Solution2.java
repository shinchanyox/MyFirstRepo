public class Solution2
{
	public static int Print(int n)
	{
		if(n==0)
			return 0 ;
		else
		{
			System.out.println(n) ;
			 return Print(n-1) ;
		}
	}
	public static void main(String s[])
	{
		System.out.println(Print(4)) ;
	}
}