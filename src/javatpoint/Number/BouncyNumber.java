package javatpoint.Number;

import java.util.Scanner;

// Bouncy Number in Java
public class BouncyNumber 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the number: ");
		int num = scanner.nextInt() ;
		scanner.close(); 
		
		if (isDecreasing(num)||isIncreasing(num)||num<101) 
		{
			System.out.println(num+" is not a Bouncy Number");
		}
		else
		{
			System.out.println(num+" is a Bouncy Number.");
		}
	}
	
	public static boolean isIncreasing(int num)
	{
		String str = Integer.toString(num) ;
		boolean flag = true ;
		char digit ;
		for(int i=0; i<str.length(); i++)
		{
			digit = str.charAt(i) ;
			if (digit>str.charAt(i+1))
			{
				flag = false ;
				break ;
			}
		}
		return flag ;
	}
	
	public static boolean isDecreasing(int num) 
	{
		String str = Integer.toString(num) ;
		boolean flag = true ;
		char digit ;
		
		for(int i=0; i<str.length();i++)
		{
			digit = str.charAt(i);
			if (digit<str.charAt(i+1)) 
			{
				flag = false ;
				break ;
			}
		}
		return flag ;
	}
}
