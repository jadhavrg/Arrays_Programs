package arrays;
// WAJP to take input from user an print the arrays.

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrograming 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the size of the data: ");
		int size = scanner.nextInt() ;
		
		int arr[] = new int[size] ;
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print("Enter the data " + (i+1) + " :");
			int data = scanner.nextInt() ;
			arr[i] = data ;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
