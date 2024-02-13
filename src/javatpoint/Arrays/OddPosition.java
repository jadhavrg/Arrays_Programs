package javatpoint.Arrays;

import java.util.Arrays;
import java.util.Scanner;

// Java Program to print the elements of an array present on odd position
public class OddPosition 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the size of an array: ");
		int [] arr = new int[scanner.nextInt()] ;
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.println("Enter the " +(i+1)+" element: ");
			arr[i] = scanner.nextInt() ;
		}
		scanner.close();
		
		System.out.println("Original array: "+Arrays.toString(arr));
		
		System.out.println("The elements of an array present on odd position: ");
		for(int i=0; i<arr.length; i+=2)
		{
			System.out.println(arr[i]);
		}
	}
}
