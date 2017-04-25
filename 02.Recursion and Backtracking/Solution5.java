import java.util.Scanner ;
public class Solution5
{
	public static void generate(int n,int k,int[] a )
	{
		if(n==0)
		{
			for(int i : a)
				System.out.print(i+" ") ;
			System.out.println() ;
		}
		else
		{
			for(int i=0;i<k;i++)
			{
				a[n-1]= i ;
				generate(n-1,k,a) ;
			}
		}
	}
	public static void main(String s[])
	{
		Scanner i = new Scanner(System.in) ;
		System.out.print("enter the k-ary string length : ") ;
		int k=i.nextInt() ;
		System.out.print("enter the desired combination length :") ;
		int n =i.nextInt() ;
		int[] a = new int[n] ;
		generate(n,k,a) ;


	}
}