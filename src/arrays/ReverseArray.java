package arrays;

import java.util.Arrays;

// WAJP to reverse 1D array and store it into new array.
public class ReverseArray 
{
	public static void main(String[] args) 
	{
		int [] arr = {10,20,30,40,50,60,70,80,90} ;
		int [] rev = new int[arr.length] ;
		
		int index = 0 ;
		
		for(int i=arr.length-1; i>=0; i--)
		{
			rev[index++] = arr[i] ;
		}
		
		System.out.println("Reverse array is: " + Arrays.toString(rev));
	}
}
