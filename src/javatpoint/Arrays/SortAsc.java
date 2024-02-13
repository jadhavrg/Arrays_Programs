package javatpoint.Arrays;

import java.util.Arrays;
import java.util.Scanner;

// Java Program to sort the elements of an array in ascending order
public class SortAsc 
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
		
		System.out.println("Original Array: "+Arrays.toString(arr));
		
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if (arr[i] > arr[j]) 
				{
					int temp = arr[i] ;
					arr[i] = arr[j] ;
					arr[j] = temp ;
				}
			}
		}
		
		System.out.println("Ascending Sorted  Array: "+Arrays.toString(arr));
	}
}
