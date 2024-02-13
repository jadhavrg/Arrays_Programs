package javatpoint.Arrays;

import java.util.Scanner;

// Java to Program Find 2nd Smallest Number in an array
public class SecondSmallestArray 
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
		
		System.out.println("Second Smallest: "+secondSmallest(arr));
		
		
	}
	
	public static int secondSmallest(int [] arr)
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
		return arr[length-2] ;
	}
}
