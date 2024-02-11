package javatpoint.Number;

import java.util.Scanner;

// Java Program to Find Smallest of Three Numbers Using Ternary Operator
public class SmallestNumber
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the number1: ");
		int num1 = scanner.nextInt() ;
		System.out.println("Enter the number2: ");
		int num2 = scanner.nextInt() ;
		System.out.println("Enter the number3: ");
		int num3 = scanner.nextInt() ;
		scanner.close();
		
		int temp = num1<num2?num1:num2 ;
		
		
		System.out.println((temp<num3)?temp+" Smallest number":num3+" Smallest number");
	}
}
