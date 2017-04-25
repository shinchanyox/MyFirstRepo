//here we try to save the extra copies of array reference made in generate() by making the array object as a global variable
import java.util.Scanner ;
public class Solution4b
{
	int[] a ;
	Solution4b(int x)
	{
		a= new int[x] ;
	}
	public void generate(int n)
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
			generate(n-1) ;
			a[n-1]=1 ;
			generate(n-1) ;

		}
	}
	public static void main(String s[])
	{
		Scanner i = new Scanner(System.in) ;
		int x= i.nextInt() ;
		new Solution4b(x).generate(x) ;


	}
}