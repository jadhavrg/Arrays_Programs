package javatpoint.Basic;

import java.util.Scanner;

public class FactorialExample 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the number: ");
		int num = scanner.nextInt() ;
		scanner.close();
		int fact = 1 ;
		
		for(int i=1; i<=num; i++)
		{
			fact *=i ;
		}
		
		System.out.println("The factorial of "+num+" is:"+fact);
	}
}
