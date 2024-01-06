package arrays;

import java.util.Arrays;

// WAJP to print unique elements from an array.

public class UniqueElement
{
	public static void main(String[] args) 
	{
		int [] arr = {10,20,30,40,50,40,10} ;
		System.out.println("Original Array: " + Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++)
		{
			if (arr[i] != 0)
			{
				int count = 0 ;
				for(int j=i+1; j<arr.length; j++)
				{
					if (arr[i]==arr[j])
					{
						count ++ ;
						arr[j] = 0;
					}
				}
				if (count == 0)
				{
					System.out.println(arr[i]);
				}
			}
		}
	}
}
