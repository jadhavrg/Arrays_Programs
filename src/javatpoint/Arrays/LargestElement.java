package javatpoint.Arrays;

import java.util.Arrays;
import java.util.Scanner;

// Java Program to print the largest element in an array
public class LargestElement 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the size of an array: ");
		int [] arr = new int[scanner.nextInt()] ;
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter the "+(i+1)+" element: ");
			arr[i] = scanner.nextInt() ;
		}
		scanner.close();
		
		System.out.println("Original array: "+Arrays.toString(arr));
		
		int max = arr[0] ;
		for(int i=0; i<arr.length; i++)
		{
			if (arr[i]<max)
			{
				max= arr[i] ;
			}
		}
		System.out.println("Largest element present in given array: "+max);
	}
}
