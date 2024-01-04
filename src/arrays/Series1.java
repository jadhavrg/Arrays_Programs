package arrays;

import java.util.Arrays;
// 24, 40, 64, 104, ?,?
public class Series1 
{
	public static void main(String[] args) 
	{
		int [] arr = new int[10] ;
		int num = 24 ;
		arr[0] = num ;
		
		for(int i=1; i<arr.length; i++)
		{
			arr[i] = (num*2)-(8*i) ;
			num = arr[i] ;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
