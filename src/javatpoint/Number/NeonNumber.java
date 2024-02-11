package javatpoint.Number;

import java.util.Scanner;

// Neon Number in Java
public class NeonNumber 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the number: ");
		int num = scanner.nextInt() ;
		scanner.close(); 
		
		if (isNeon(num))
		{
			System.out.println(num+" is Neon number.");
		}
		else
		{
			System.out.println(num+" is not a Neon number.");
		}
	}
	
	public static boolean isNeon(int num) 
	{
		int square = num*num ;
		int temp = square ;
		int sum = 0 ;
		while(temp!=0)
		{
			int rem = temp%10 ;
			sum+=rem ;
			temp/=10;
		}
		return(sum==num) ;
	}
}
