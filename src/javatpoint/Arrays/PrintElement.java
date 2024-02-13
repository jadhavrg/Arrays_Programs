package javatpoint.Arrays;

import java.util.Scanner;

// Java Program to print the elements of an array
public class PrintElement 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the size of an array: ");
		int [] arr = new int[scanner.nextInt()] ;
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("The elements "+(i+1)+ " elements: ");
			arr[i] = scanner.nextInt() ;
		}
		
		System.out.println("The elements are: ");
		for(int i : arr)
			System.out.println(i);
	}
}
