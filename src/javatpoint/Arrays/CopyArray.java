package javatpoint.Arrays;

import java.util.Arrays;

// Program to copy all elements of one array into another array
public class CopyArray 
{
	public static void main(String[] args) 
	{
		int [] arr = {1,2,3,4,5,6,7} ;
		int [] newArr = new int[arr.length] ;
		
		for(int i=0; i<arr.length; i++)
		{
			newArr[i] = arr[i] ;
		}
		
		System.out.println("Original Array: "+Arrays.toString(arr));
		System.out.println("Copied Array: "+ Arrays.toString(newArr));
	}
}
