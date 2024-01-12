
package arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

// WAJP to rotate an array based on user index(left shift).
public class RotateArray1 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		int [] arr = {8,5,2,6,7,1,2,9} ;
		System.out.println("Before Rotation :"+Arrays.toString(arr));
		
		System.out.println("Enter the index value: ");
		int index = scanner.nextInt() ;
		scanner.close();
		
		for(int i=0; i<index; i++)
		{
			int last = arr[0] ;
			for(int j=0; j<arr.length-1; j++)
			{
				arr[j] = arr[j+1] ;
			}
			arr[arr.length-1] = last ;
		}
		
		System.out.println("After Rotation :"+Arrays.toString(arr));
	}
}
