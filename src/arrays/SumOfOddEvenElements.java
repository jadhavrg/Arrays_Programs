package arrays;

// WAJP to calculate the sum of even and odd elements in an array and print it.

public class SumOfOddEvenElements
{
	public static void main(String[] args)
	{
		byte [] arr = {1,2,3,4,5,6,7,8,9,127} ;
		int evenSum = 0; 
		int oddSum = 0 ;
		
		int i =0;
		while(i<arr.length)
		{
			int num = arr[i] ;
			if (num % 2== 0)
			{
				evenSum += num ;
			}
			else
			{
				oddSum += num ;
			}
			i++ ;
		}
		
		System.out.println("Sum of even elements is: " + evenSum);
		System.out.println("Sum of odd elements is: " + oddSum);
	}
}
