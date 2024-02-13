package javatpoint.Arrays;

import java.util.Scanner;

// Java Program to print the sum of all the items of the array
public class SumOfArray 
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
		
		int sum = 0 ;
		for(int i=0; i<arr.length; i++)
		{
			sum +=arr[i] ;
		}
		
		System.out.println("Sum of all the elements of an array: " + sum);
	}
}
