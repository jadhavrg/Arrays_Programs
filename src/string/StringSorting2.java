package string;

import java.util.Arrays;

public class StringSorting2 
{
	public static void main(String[] args) 
	{
		char [] arr = {'A','D','M','I','T'} ;
		System.out.println("Original Array: " + Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++)
		{
			char temp ;
			for(int j=i+1; j<arr.length; j++)
			{
				if (arr[i]>arr[j])
				{
					temp = arr[j] ;
					arr[j] = arr[i] ;
					arr[i] = temp ;
				}
			}
		}
		
		System.out.println("After sorting Array: " + Arrays.toString(arr));
		
		int count = 0 ;
		for(int i=(++arr[1]); i<arr[arr.length-2];i++)
		{
			count ++ ;
		}
		System.out.println("Count of the characters between second character from right side and second character from left side is: " + count);
	}
}
