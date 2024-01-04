package arrays;

import java.util.Arrays;

public class Convert2dIntoReverse1D
{
	public static void main(String[] args) 
	{
		int [][] a = {{10,20,30,40},{5,6,7,8,9,4}} ;
		int index = 0 ;
		for (int[] i : a) 
		{
			index += i.length ;
		}
		
		int [] arr = new int[index] ;
		
		int index1 = 0 ;
		
		for(int i=a.length-1; i>=0; i--)
		{
			for(int j=a[i].length-1; j>=0; j--)
			{
				arr[index1++] = a[i][j] ;
			}
		}
		
		System.out.println("Two dimentional array is converted into 1D and also reverse it: "+Arrays.toString(arr));
	}
}
