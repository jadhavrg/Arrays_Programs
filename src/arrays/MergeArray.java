package arrays;

import java.util.Arrays;

public class MergeArray
{
	public static void main(String[] args) 
	{
		int [] a = {1,2,3,4,5,6} ;
		int [] b = {7,8,9,10,11,12} ;
		
		int [] arr = new int[a.length+ b.length] ;
		int index = 0 ;
		
		for(int i=0; i<arr.length; i++)
		{
			if (i<a.length)
			{
				arr[i] = a[i] ;
			}
			else
			{
				arr[i] = b[index++] ;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
