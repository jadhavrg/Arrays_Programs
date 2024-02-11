package javatpoint.Basic;

import java.util.Scanner;

// Buzz Number Java
public class BuzzNumber 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the number: ");
		int num = scanner.nextInt() ;
		scanner.close(); 
		
		if (isBuzz(num))
		{
			System.out.println(num+" is a Buzz Number");
		}
		else
		{
			System.out.println(num+" is Not a Buzz Number");
		}
		
	}
	
	public static boolean isBuzz(int num) 
	{
		int temp  = num ;
		int rem = 0 ;
		
		if (temp % 7==0)
		{
			return true ;
		}
		else
		{
			while(temp!=0)
			{
				rem = temp%10 ;
				break ;
			}
			if (rem==7)
			{
				return true ;
			}
			else
			{
				return false ;
			}
		}
	}
}
