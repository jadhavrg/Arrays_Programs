package javatpoint.Number;

import java.util.Scanner;

// Emirp Number in Java or twisted prime numbers
public class EmirpOrTwistedNumber 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the number: ");
		int num = scanner.nextInt() ;
		scanner.close(); 
		
		if (isPrime(num))
		{
			int temp = num ;
			int reverse = 0 ;
			while(temp != 0)
			{
				int rem = temp%10 ;
				reverse = (reverse*10)+ rem ;
				temp/=10 ;
			}
			if (isPrime(reverse)) 
			{
				System.out.println(num+ " is Twisted Prime or Emirp Number.");
			}
			else
			{
				System.out.println(num+ " is not a Twisted Prime or Emirp Number.");
			}
		}
		else
		{
			System.out.println(num+ " is not a Twisted Prime or Emirp Number.");
		}
		
	}
	
	public static boolean isPrime(int num) 
	{
		boolean count = true ;
		for(int i=2;i<num;i++)
		{
			if (num%i==0)
			{
				count = false ;
				break ;
			}
		}
		return count ;
	}
}
