import java.util.Scanner ;
class matrix_paths
{
	public static void paths(int[][] a ,int[] result,int index)
	{
		if(index == a.length)
		{
			for(int x: result)
				System.out.print(x+" ") ;
			System.out.print("\t") ;
		}
		else
		{
			for(int i=0;i<a[index].length;i++)
			{
				result[index]=a[index][i] ;
				paths(a,result,index+1) ;
			}
		}
	}
	public static void main(String s[])
	{
		int[][] a = {{1,2,3}, {4,5,6}, {7,8,9}} ;
		paths(a,new int[3],0) ;
		System.out.println() ;


	}
}