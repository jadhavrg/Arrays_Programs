package javatpoint.Arrays;

import java.util.Arrays;
import java.util.Scanner;

// Java Program to print the elements of an array present on even position
public class EvenPosition 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the size of an array: ");
		int [] arr = new int[scanner.nextInt()] ;
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter element "+(i+1)+ " elements: ");
			arr[i] = scanner.nextInt() ;
		}
		
		System.out.println("Original array: "+Arrays.toString(arr));
		
		System.out.println("The elements of an array present on even position: ");
		for(int i=1; i<arr.length; i+=2)
		{
				System.out.println(arr[i]) ;
		}
	}
}
