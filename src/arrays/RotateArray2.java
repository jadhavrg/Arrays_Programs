package arrays;

import java.util.Arrays;
import java.util.Scanner;

//WAJP to rotate an array based on user index(right shift).
public class RotateArray2 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		int [] arr = {10,20,30,40,50,60,70} ;
		System.out.println("Original Array: " + Arrays.toString(arr));
		
		System.out.println("Enter the index : ");
		int index = scanner.nextInt() ;
		
//		for(int i=0; i<index; i++)
//		{
//			int last = arr[0] ;
//			for(int j=0; j<arr.length-1; j++)
//			{
//				arr[j] = arr[j+1] ;
//			}
//			arr[arr.length-1] = last ;
//		}
		
		for(int i=0; i<arr.length-index; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				arr[j] = arr[arr.length-1] ;
			}
		}
		
		System.out.println("After Rotation :"+Arrays.toString(arr));
	}
}
