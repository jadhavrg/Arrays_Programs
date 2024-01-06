package arrays;
// WAJP to swap two elements based on user index.

import java.util.Arrays;
import java.util.Scanner;

public class SwapElements 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		int arr [] = {10,20,30,40,50,60} ;
		System.out.println("Original array: " + Arrays.toString(arr));
		
		System.out.println("Enter the first index: ");
		int index1 = scanner.nextInt() ;
		System.out.println("Enter the second index: ");
		int index2 = scanner.nextInt() ;
		
		int temp ;
		if ((index1>=0&&index1<arr.length)&&(index2>=0&&index2<arr.length)) 
		{	
			temp = arr[index2] ;
			arr[index2] = arr[index1] ;
			arr[index1] = temp ;
			
			System.out.println("After swapping array: " + Arrays.toString(arr));
		}
		else
		{
			System.out.println("Please enter the index values below than " + arr.length);
		}
		
		
	}
}
