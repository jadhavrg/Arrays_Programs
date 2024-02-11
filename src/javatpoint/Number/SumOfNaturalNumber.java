package javatpoint.Number;

import java.util.Scanner;

// Java Program to Find Sum of Natural Numbers
public class SumOfNaturalNumber 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the number till we want addition of natual numbers:  ");
		int num = scanner.nextInt() ;
		scanner.close(); 
		int sum = 0 ;
		for(int i=1; i<=num;i++)
		{
			sum+=i ;
		}
		
		System.out.println(sum);
	}
}
