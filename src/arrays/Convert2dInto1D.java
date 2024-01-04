package arrays;

import java.util.Arrays;
// WAJP to convert 2D array in 1D.
public class Convert2dInto1D 
{
	public static void main(String[] args) 
	{
		int [][] a = {{10,20,30},{40,50,60,70}} ;
		int index = 0 ;
		for (int[] is : a) 
		{
			index += is.length ;
		}
		int [] arr = new int[index] ;
		
		int index1 = 0 ;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				arr[index1++] = a[i][j] ;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
