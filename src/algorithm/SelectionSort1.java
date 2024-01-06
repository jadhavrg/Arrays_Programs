package algorithm;

import java.util.Arrays;

// WAJP for selection sorting for ascending order.
public class SelectionSort1 
{
	public static void main(String[] args) 
	{
		int [] arr = {46,25,78,63,14,54,264,45,63} ;
		System.out.println("Before Sorting: " + Arrays.toString(arr));
		
		int temp = 0 ;
		int pos = 0 ;
		for(int i=0; i<arr.length; i++)
		{
			pos = i ;
			for(int j=i+1; j<arr.length-1; j++)
			{
				if (arr[pos]>arr[j])
				{
					pos = j ;
				}
			}
			temp = arr[pos] ;
			arr[pos] = arr[i] ;
			arr[i] = temp ;
		}
		
		System.out.println("After Sorting: " + Arrays.toString(arr));
	}
}
