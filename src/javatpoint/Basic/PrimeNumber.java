package javatpoint.Basic;

import java.util.Scanner;

public class PrimeNumber 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the Starting number: ");
		int start = scanner.nextInt() ;
		System.out.println("Enter the Ending number: ");
		int end = scanner.nextInt() ;
		scanner.close();
		
		System.out.println("The prime numbers are: ");
		for(int i=start; i<=end; i++)
		{
			int count = 0 ;
			if (i>1)
			{
				for(int j=2; j<i; j++)
				{
					if (i%j==0) 
					{
						count++ ;
						break ;
					}
				}
				if (count == 0) 
				{
					System.out.println(i);
				}
			}
			
		}
	}
}
