package arrays;

import java.util.Scanner;

// WAJP to count the frequency of an elements.

public class CountFrequency 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the size of an array: ");
		int [] arr = new int[scanner.nextInt()] ;
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter the " + (i+1)+ " elements: ");
			arr[i] = scanner.nextInt() ;
		}
		scanner.close();
		
		for(int i=0; i<arr.length; i++)
		{
			int count = 1 ;
			if (arr[i] != Integer.MAX_VALUE) 
			{
				for(int j=i+1; j<arr.length; j++)
				{
					if (arr[i] == arr[j]) 
					{
						count ++ ;
						arr[j] = Integer.MAX_VALUE ;
					}
				}
			}
			if (arr[i] != Integer.MAX_VALUE)
			{
				System.out.println(arr[i] +" : "+ count);
			}
		}
	}
}
