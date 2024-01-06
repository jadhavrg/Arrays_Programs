package arrays;

import java.util.Arrays;
import java.util.Scanner;

//WAJP to insert an elements at user specified index values.
public class InsertElement2 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		int [] arr = {10,20,30,40,50,60,70,80,90,100,110,120} ;
		
		System.out.println("Enter the no of values: ");
		int size = scanner.nextInt() ;
		
		System.out.println("Enter the index value: ");
		int index = scanner.nextInt() ;
		
		int [] newArr = new int[(arr.length)+size] ;
		int newIndex = 0 ;
		
		if ((index>=0)&&(index<arr.length))
		{
			for(int i=0; i<arr.length; i++)
			{
				if (i==index) 
				{
					for(int j=1; j<=size; j++)
					{
						System.out.println("Enter the "+ j + " element: ");
						newArr[newIndex++] = scanner.nextInt() ;
					}
				}
				newArr[newIndex++] = arr[i] ;
			}
		}
		
		System.out.println(Arrays.toString(newArr));
	}
}
