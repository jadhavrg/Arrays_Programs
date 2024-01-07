package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

// WAJP to find even and odd elements from an array and store it in seperates arrays.
public class EvenOddArray 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the size of an array: ");
		int [] arr = new int[scanner.nextInt()] ;
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter the " + (i+1) + " elements : ");
			arr[i] = scanner.nextInt() ;
		}
		
		int [] evenArray = evenArray(arr) ;
		int [] oddArray = oddArray(arr) ;
		
		System.out.println("Even array: "+Arrays.toString(evenArray));
		System.out.println("Odd array: "+Arrays.toString(oddArray));
	}
	
	public static int[] evenArray(int [] arr)
	{
		int countEven = 0 ;
		
		for (int i : arr)
		{
			if (i%2==0)
			{
				countEven++ ;
			}
		}
		
		int [] evenArray = new int[countEven] ;
		int index = 0 ;
		for(int i=0; i<arr.length;i++)
		{
			if (arr[i]%2==0)
			{
				evenArray[index++] = arr[i] ;
			}
		}
		
		return evenArray ;
	}
	
	public static int[] oddArray(int [] arr)
	{
		int countOdd = 0 ;
		
		for (int i : arr)
		{
			if (i%2!=0)
			{
				countOdd++ ;
			}
		}
		
		int [] oddArray = new int[countOdd] ;
		int index = 0 ;
		for(int i=0; i<arr.length;i++)
		{
			if (arr[i]%2!=0)
			{
				oddArray[index++] = arr[i] ;
			}
		}
		
		return oddArray ;
	}
}
