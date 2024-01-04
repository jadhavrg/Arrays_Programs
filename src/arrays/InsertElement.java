package arrays;

import java.util.Arrays;
import java.util.Scanner;

// WAJP to insert a new elements at last of an array.
public class InsertElement 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		int [] arr = {10,20,30,40,50} ;
		System.out.println("Enter the size : ");
		int size = scanner.nextInt() ;
		
		int [] newArr = new int[(arr.length)+size] ;
		int index = 0 ;
		for (int num : arr) 
		{
			newArr[index++] = num ;
		}
		
		for(int i=0; i<size; i++)
		{
			System.out.println("Enter the "+ (i+1) + " elements: ");
			newArr[index++] = scanner.nextInt() ;
		}
		scanner.close();
		
		System.out.println("New array is: "+Arrays.toString(newArr));
	}
}
