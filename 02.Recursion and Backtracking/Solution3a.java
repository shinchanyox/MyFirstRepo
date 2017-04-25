public class Solution3a
{
	public static boolean check(int[] a,int index )
	{
		if(index == a.length-1)
			return true ;
		else if(a[index] > a[index+1])
			return  false ;
		else
			 return check(a,index+1) ;
	}
	public static void main(String s[])
	{
		int[] a ={-1,3,1,2,3,4,5,6} ;
		System.out.println(check(a,0)) ;
	}
}