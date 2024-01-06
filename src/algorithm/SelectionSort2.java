package algorithm;

import java.util.Arrays;

//WAJP for selection sorting for descending order.
public class SelectionSort2 
{
	public static void main(String[] args)
	{
		int [] numbers = {54,63,24,145,12,67,5,426,30,45,51} ;
		System.out.println("Before Sorting: " + Arrays.toString(numbers));
		
		int temp = 0 ;
		int pos = 0 ;
		for(int i=0; i<numbers.length; i++)
		{
			pos = i ;
			for(int j=i+1; j<numbers.length-1; j++)
			{
				if (numbers[pos]<numbers[j])
				{
					pos = j ;
				}
			}
			temp = numbers[pos] ;
			numbers[pos] = numbers[i] ;
			numbers[i] = temp ;
		}
		
		System.out.println("After Sorting: " + Arrays.toString(numbers));
		
	}
}
