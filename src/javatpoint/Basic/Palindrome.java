package javatpoint.Basic;

import java.util.Scanner;

public class Palindrome
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the number: ");
		int num = scanner.nextInt() ;
		int temp = num ;
		int reverse = 0 ;
		
		while(num != 0)
		{
			int rem = num % 10 ;
			reverse =+(reverse*10)+ rem ;
			num=num/10;
		}
		
		if (temp==reverse) 
		{
			System.out.println("It is a palindrome number");
		}
		else
		{
			System.out.println("It is not a palindrome number");
		}
	}
}
