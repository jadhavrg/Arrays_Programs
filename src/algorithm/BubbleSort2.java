package algorithm;

import java.util.Arrays;

// WAJP for bubble sorting in descending order.
public class BubbleSort2 
{
	public static void main(String[] args) 
	{
		int [] numbers = {45,57,26,42,87,63,78,49,20};
		System.out.println("Before sorting: " + Arrays.toString(numbers));
		
		for(int i=0; i<numbers.length; i++)
		{
			int temp ;
			for(int j=i+1; j<numbers.length-1; j++)
			{
				if (numbers[i]<numbers[j])
				{
					temp = numbers[j] ;
					numbers[j] = numbers[i] ;
					numbers[i] = temp ;
				}
			}
		}
		System.out.println("After sorting: " + Arrays.toString(numbers));
	}
}
