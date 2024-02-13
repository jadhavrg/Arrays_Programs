package javatpoint.Arrays;

import java.util.Scanner;

// Java Program to Remove Duplicate Element in an array
public class RemoveDupEle 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the size of an array: ");
		int arr [] = new int[scanner.nextInt()] ;
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enetr the "+(i+1)+" element: ");
			arr[i] = scanner.nextInt() ;
		}
		scanner.close();
		
		for(int i=0; i<arr.length; i++)
		{
			int count = 0 ;
			if (arr[i] != Integer.MAX_VALUE) 
			{
				for(int j=i+1; j<arr.length; j++)
				{
					if (arr[i]==arr[j])
					{
						count ++ ;
						arr[j] = Integer.MAX_VALUE ;
					}
				}
			}
			
			if (arr[i] != Integer.MAX_VALUE) 
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
}
