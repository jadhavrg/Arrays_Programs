package arrays;

import java.util.Arrays;
import java.util.Scanner;import javax.print.DocFlavor.BYTE_ARRAY;

// WAJP to find the count of elements and stote int an 2d array with respective element.
public class FrequencyArray 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("enter the size of an array: ");
		int [] arr = new int[scanner.nextInt()] ;
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter the "+ (i+1)+ " elements: " );
			arr[i] = scanner.nextInt() ;
		}
		scanner.close();
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		int cntUniq = countUnique(arr) ;
		
		int [][] freqArray = new int[cntUniq][2] ;
		int count = 0 ;
		int m = 0 ;
		int n = 0 ;
		
		for(int i=0; i<arr.length; i+=count)
		{
			count = 0 ;
			for(int j=0; j<arr.length; j++)
			{
				if (arr[i] == arr[j]) 
				{
					count ++ ;
				}
			}
			freqArray[m++][0] = arr[i] ;
			freqArray[n++][1] = count ;
		}
		
		System.out.println(Arrays.deepToString(freqArray));
	}
	
	static int countUnique(int [] arr)
	{
		int count = 0 ;
		for(int i=0; i<arr.length; i++)
		{
			int j=0; 
			for(;j<arr.length;j++)
			{
				if (arr[i] == arr[j]) 
				{
					break ;
				}
			}
			if (i==j) 
			{
				count ++ ;
			}
		}
		return count ;
	}
}
