package arrays;

import java.util.Arrays;

// WAJP to find second max element from an array.
public class SecondMax 
{
	public static void main(String[] args) 
	{
		int [] numbers = {10,20,30,45,75,12,451,542} ;
		
//		int secondMax = maxElement(numbers, numbers.length) ;
		
		int temp ;
		for(int i=0; i<numbers.length; i++)
		{
			for(int j=i+1; j<numbers.length; j++)
			{
				if (numbers[i]>numbers[j])
				{
					temp = numbers[i] ;
					numbers[i] = numbers[j] ;
					numbers[j] = temp ;
				}
			}
		}
		System.out.println("Second maximum element is: " + (numbers[numbers.length-2]));
		
	}
	
//	public static int  maxElement(int [] num, int size)
//	{
//		int temp ;
//		for(int i=0; i<size; i++)
//		{
//			for(int j=i+1; j<size; j++)
//			{
//				if (num[i]>num[j])
//				{
//					temp = num[i] ;
//					num[i] = num[j] ;
//					num[j] = temp ;
//				}
//			}
//		}
//		return num[size-2] ;
//	}
}
