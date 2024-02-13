package javatpoint.Arrays;

import java.util.Arrays;
import java.util.Scanner;

// Java Program to print the duplicate elements of an array
public class DuplicateElement 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the size of an array: ");
		int [] arr = new int[scanner.nextInt()] ;
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.println("Enter the "+(i+1)+" elements: ");
			arr[i] = scanner.nextInt() ;
		}
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("The Duplicates elements are: ");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length;j++)
			{
				if (arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				}
			}
		}
	}
}
