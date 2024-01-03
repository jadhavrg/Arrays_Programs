package arrays;

import java.util.Arrays;
// WAJP to merge a 1D array by alternate array. 
public class AlternateElements 
{
	public static void main(String[] args)
	{
		int [] a = {10,20,30,40,50} ;
		int [] b = {60,70,80,90,100,110} ;
		
		int [] arr = new int[(a.length)+(b.length)] ;
		
		int index = 0 ;
		
		for(int i=0; i<arr.length; i++)
		{
			if (i<a.length)
			{
				arr[index++] = a[i] ;
			}
			if(i<b.length)
			{
				arr[index++] = b[i] ;
			}
		}
		
		System.out.println("Alternate Elements array: "+Arrays.toString(arr));
	}
}
