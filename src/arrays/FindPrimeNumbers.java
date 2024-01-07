package arrays;

import java.util.Arrays;
import java.util.Scanner;

// WAJP to user entered count of prime numbers and store it an array.
public class FindPrimeNumbers 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the how many prime numbers u want: ");
		int num = scanner.nextInt() ;
		scanner.close();
		int [] primeArray = getPrimeNumberArray(num) ;
		
		System.out.println(Arrays.toString(primeArray));
	}
	
	public static int [] getPrimeNumberArray(int num) 
	{
		int [] primeArray = new int[num] ;
		int index = 0 ;
		for(int i=3;;i++)
		{
			int count = 0;
			for(int j=2; j<i; j++)
			{
				if (i%j==0)
				{
					count ++ ;
					break ;
				}
			}
			if (count ==0)
			{
				primeArray[index++] = i ;
				if (index==num)
				{
					break ;
				}
			}
		}
		return primeArray ;
	}
}
