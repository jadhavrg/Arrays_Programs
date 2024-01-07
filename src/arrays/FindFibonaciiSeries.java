package arrays;

import java.util.Arrays;
import java.util.Scanner;

// WAJP to find fibonacii series and store it in an array.
public class FindFibonaciiSeries 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the how many fibonacii numbers u want: ");
		int num = scanner.nextInt() ;
		scanner.close();
		int[] fibanaciiArray = getFibonaciiArray(num) ;
		
		System.out.println(Arrays.toString(fibanaciiArray));
	}
	
	public static int [] getFibonaciiArray(int num)
	{
		int [] fibanaciiArray = new int [num] ;
		int num1 = 0;
		int num2 = 1;
		int num3 ;
		int count = 0 ;
		int index = 0 ;
		
		while(count<num)
		{
			num3 = num1 + num2 ;
			fibanaciiArray[index++] = num1 ;
			num1 = num2;
			num2 = num3 ;
			count ++ ;
		}
		return fibanaciiArray ;
	}
}
