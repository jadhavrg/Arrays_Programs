package arrays;

import java.util.Arrays;

public class CloningArray2 
{
	public static void main(String[] args) 
	{
		char [] arr = {'a', 'e', 'i', 'o', 'u'} ;
		char [] duplicate = new char[arr.length] ;
		
		for(int i=0; i<arr.length; i++)
		{
			duplicate[i] = arr[i] ;
		}
		
//		arr[0] = 'A' ;
		
		System.out.println("Original Array: " + Arrays.toString(arr));
		System.out.println("Duplicate Array: " + Arrays.toString(duplicate));
		
		
	}
}
