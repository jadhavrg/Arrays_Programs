package javatpoint.Number;

import java.util.Scanner;

// Spy Number in Java
public class SpyNumber 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the number: ");
		int num = scanner.nextInt() ;
		scanner.close(); 
		
		if (isSpy(num)) 
		{
			System.out.println(num+" is a spy number.");
		}
		else
		{
			System.out.println(num+" is not a spy number.");
		}
	}
	
	public static boolean isSpy(int num) 
	{
		int sum = 0 ;
		int product = 1 ;
		
		while(num!=0)
		{
			int rem = num%10 ;
			sum+=rem ;
			product*=rem ;
			num/=10 ;
		}
		return (sum==product) ;
	}
}
