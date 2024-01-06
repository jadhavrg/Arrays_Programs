package algorithm;

import java.util.Arrays;

// WAJP for bubble sorting in ascending order.

public class BubbleSort1 
{
	public static void main(String[] args) 
	{
		int [] arr = {4,2,5,7,8,7,5,6,2,78,45,45} ;
		System.out.println("Before Sorting: " + Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++)
		{
			int temp ;
			for(int j=i+1; j<arr.length; j++)
			{
				if (arr[i]>arr[j]) 
				{
					temp = arr[j];
					arr[j] = arr[i] ;
					arr[i] = temp ;
				}
			}
		}
		System.out.println("After sorting: " + Arrays.toString(arr));
		
	}
}
