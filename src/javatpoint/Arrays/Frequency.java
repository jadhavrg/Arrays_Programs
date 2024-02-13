package javatpoint.Arrays;

import java.util.Arrays;
import java.util.Scanner;

// Program to find the frequency of each element in the array
public class Frequency 
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
		
		System.out.println("The Arrays: "+ Arrays.toString(arr));
		
		for(int i=0; i<arr.length;i++)
		{
			int count = 1 ;
			if (arr[i] != Integer.MAX_VALUE)
			{
				for(int j=i+1; j<arr.length;j++)
				{
					if (arr[i]==arr[j])
					{
						count++ ;
						arr[j] = Integer.MAX_VALUE ;
					}
				}
			}
			if (arr[i] != Integer.MAX_VALUE)
			{
				System.out.println(arr[i]+" is Repeated " +count+ " times");
			}
		}
	}
}
