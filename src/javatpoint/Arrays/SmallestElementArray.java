package javatpoint.Arrays;

import java.util.Scanner;

// Java Program to Find Smallest Number in an array
public class SmallestElementArray 
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
		
		System.out.println("Smallest Element: "+smallestElement(arr));
	}
	
	public static int smallestElement(int arr[]) 
	{
		int length = arr.length ;
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
		return arr[length-1] ;
	}
}
