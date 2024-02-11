package javatpoint.Number;

import java.util.Scanner;

// Java Program to Check if a Number is Positive or Negative
public class CheckPositiveNegative 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the number: ");
		int num = scanner.nextInt() ;
		scanner.close(); 
		
		if (num > 0)
		{
			System.out.println(num+ " is a Positive number.");
		}else if(num<0)
		{
			System.out.println(num+ " is a Negative number.");
		}
	}
}
