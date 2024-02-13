package javatpoint.Arrays;

import java.util.Scanner;

// Java Program to Remove Duplicate Element in an array
public class OddEvenArray 
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
		
		System.out.println("Even elements are: ");
		for(int i : arr)
		{
			if (i%2==0) 
			{
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
		System.out.println("Odd elements are: ");
		for(int i: arr)
		{
			if (i%2!=0) 
			{
				{
					System.out.print(i+" ");
				}
			}
		}
	}
}
