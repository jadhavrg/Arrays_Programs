package arrays;
// WAJP to insert an element at user specified index value.
import java.util.Arrays;
import java.util.Scanner;
public class InsertElement1 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		int[] arr = {10,20,30,40,50,60,70} ;
		System.out.println("Enter the index value: ");
		int index = scanner.nextInt() ;
		System.out.println("Enter the element: ");
		int element = scanner.nextInt() ;
		scanner.close();
		int [] newArr = new int[arr.length+1] ;
		int index1 = 0 ;
		if (index < arr.length)
		{
			for(int i=0; i<arr.length; i++)
			{
				if (i==index)
				{
					newArr[index1++] = element ;
				}
				newArr[index1++] = arr[i] ;
			}
			System.out.println("New Array: "+Arrays.toString(newArr));
		}
		else
		{
			System.out.println("Invalid index...!");
		}
		
		
		
		
	}
}
