package arrays;

import java.util.Arrays;

public class Merge2DArray 
{
	public static void main(String[] args)
	{
		int [][] a = {{10,20,30},{40,50,60}} ;
		int [][] b = {{1,2,3},{4,5,6}} ;
		
		int [][] arr = new int[a.length+b.length][] ;
		
		int index = 0 ;
		for (int[] is : a) 
		{
			arr[index++] = new int [is.length] ;
		}
		for (int[] is : b) 
		{
			arr[index++] = new int[is.length] ;
		}
		
		int i = 0 ;
		for(;i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				arr[i][j] = a[i][j] ;
			}
		}
		for(int k=0; k<b.length; k++)
		{
			for(int j=0; j<b[k].length; j++)
			{
				arr[i][j] = b[k][j] ;
			}
			i++ ;
		}
		
		
		
		
		System.out.println("Merged array is: "+Arrays.deepToString(arr));
	}
}
