package arrays;

import java.util.Arrays;

// WAJP to remove duplicates elements from an array.
public class RemoveDuplicateElement 
{
	public static void main(String[] args) 
	{
		int [] arr = {10,20,30,40,50,20,10} ;
		
		int index = 0 ;
		for(int i=0; i<arr.length; i++)
		{
			if (arr[i] != 0)
			{
				int count = 0 ;
				for(int j=i+1; j<arr.length; j++)
				{
					if (arr[i] == arr[j])
					{
						count ++ ;
						arr[j] = 0 ;
					}
				}
				index += count ;
				
			}
		}
		
		int [] newArr = new int[arr.length-index] ;
		int newIndex = 0 ;
		for(int i=0; i<arr.length; i++)
		{
			if (arr[i] != 0)
			{
				newArr[newIndex++] = arr[i] ;
			}
		}
		
		System.out.println(Arrays.toString(newArr));
	}
}
