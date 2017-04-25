public class Solution3b
{
	public static boolean check(int[] a ,int index)
	{
		if(index ==a.length-1)
			return true ;
		else
			return(a[index]>a[index+1]?false:check(a,index+1)) ;

	}
	public static void main(String s[])
	{
		int[] a ={1,2,3,4,5,6,-1} ;
		System.out.println(check(a,0)) ;

	}
}