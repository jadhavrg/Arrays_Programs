package javatpoint.Arrays;

import java.util.Arrays;
import java.util.Scanner;

// Java Program to print the smallest element in an array
public class SmallestElement 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the size of an array: ");
		int [] arr = new int[scanner.nextInt()] ;
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter the "+(i+1)+ " element: ");
			arr[i]= scanner.nextInt() ;
		}
		scanner.close();
		
		System.out.println(Arrays.toString(arr));
		
		int min = arr[0] ;
		for(int i=0; i<arr.length; i++)
		{
			if (arr[i]<min)
			{
				min = arr[i] ;
			}
		}
		
		System.out.println("Smallest element present in given array: " + min);
	}
}
