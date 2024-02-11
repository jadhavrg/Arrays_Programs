package javatpoint.Number;

import java.util.Scanner;

// Automorphic Number Program in Java
public class AutomorphocNumber 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the number: ");
		int num = scanner.nextInt() ;
		scanner.close();
		
		int square = num*num ;
		
		if (isAutomaorphoc(num, square)) 
		{
			System.out.println(num+ " is a automorphic number.");
		}
		else
		{
			System.out.println(num + " is not a automorphic number.");
		}
	}
	
	public static boolean isAutomaorphoc(int num, int square) 
	{
		if (num%10 != square%10) 
		{
			num/=10 ;
			square/=10 ;
			return false ;
		}
		return true ;
	}
}
