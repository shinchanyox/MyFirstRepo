import java.util.Scanner ;
public class Solution4c
{
	public static void generate(int n,int[] a )
	{
		if(n==0)
		{
			for(int i : a)
				System.out.print(i+" ") ;
			System.out.println() ;
		}
		else
		{
			for(int i=0;i<2;i++)
			{
				a[n-1]= i;
				generate(n-1,a) ;
			}

		}
	}
	public static void main(String s[])
	{
		Scanner i = new Scanner(System.in) ;
		int n =i.nextInt() ;
		int[] a = new int[n] ;
		generate(n,a) ;


	}
}