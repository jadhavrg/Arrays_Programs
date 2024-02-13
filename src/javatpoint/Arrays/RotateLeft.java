package javatpoint.Arrays;
// Java Program to left rotate the elements of an array
import java.util.Arrays;
import java.util.Scanner;

// Program to left rotate the elements of an array
public class RotateLeft 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the size of an array: ");
		int [] arr = new int [scanner.nextInt()] ;
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enthe the "+(i+1)+" elements: ");
			arr[i] = scanner.nextInt() ;
		}
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Enter the Index: ");
		int index = scanner.nextInt() ;
		
		for(int i=0; i<index;i++)
		{
			int first = arr[0];
			for(int j=0; j<arr.length-1; j++)
			{
				arr[j] = arr[j+1] ;
			}
			arr[arr.length-1] = first ;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
