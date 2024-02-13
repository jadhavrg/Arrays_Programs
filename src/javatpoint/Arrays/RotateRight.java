package javatpoint.Arrays;
// Java Program to right rotate the elements of an array
import java.util.Arrays;
import java.util.Scanner;

public class RotateRight 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the size of an array: ");
		int [] arr = new int[scanner.nextInt()] ;
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter the "+(i+1)+" elements: ");
			arr[i] = scanner.nextInt() ;
		}
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Enter the index: ");
		int index = scanner.nextInt() ;
		
		for(int i=0; i<index; i++)
		{
			int last = arr[arr.length-1] ;
			for(int j=arr.length-1; j>0; j--)
			{
				arr[j] = arr[j-1] ;
			}
			arr[0] = last ;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
