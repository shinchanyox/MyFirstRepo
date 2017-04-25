import java.util.Scanner ;
public class Solution4a
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
			a[n-1]=0 ;
			generate(n-1,a) ;
			a[n-1]=1 ;
			generate(n-1,a) ;

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