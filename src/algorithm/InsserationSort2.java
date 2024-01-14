package algorithm;

import java.util.Arrays;
import java.util.Scanner;

//WAJP for inseration sorting in descending order.
public class InsserationSort2 
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
		System.out.println("Before sorting: " + Arrays.toString(arr));
		
		for(int i=1; i<arr.length; i++)
		{
			int ele = arr[i] ;
			int j= i-1 ;
			while(j>=0 && arr[j]<ele)
			{
				arr[j+1] = arr[j] ;
				j-- ;
			}
			arr[j+1] = ele ;
		}
		
		System.out.println("After sorting : " + Arrays.toString(arr));
		
	}
}
