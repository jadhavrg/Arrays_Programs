package javatpoint.Arrays;

import java.util.Arrays;
import java.util.Scanner;

// Java Program to sort the elements of an array in descending order
public class SortDes 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the size of an array: ");
		int [] arr = new int[scanner.nextInt()] ;
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter the "+(i+1)+ " elememts: ");
			arr[i] = scanner.nextInt() ;
		}
		scanner.close();
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if (arr[i] < arr[j]) 
				{
					int temp = arr[i] ;
					arr[i] = arr[j] ;
					arr[j] = temp ;
				}
			}
		}
		
		System.out.println("Descending Sorted array: "+Arrays.toString(arr));
	}
}
