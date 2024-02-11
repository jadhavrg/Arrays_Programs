package javatpoint.Number;

import java.util.Scanner;

// Duck Number Java
public class DuckNumber 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the number: ");
		int num = scanner.nextInt() ;
		scanner.close();
		
		if (isDuck(num)) 
		{
			System.out.println(num+" is a Duck Number.");
		}
		else
		{
			System.out.println(num+" is not a Duck Number.");
		}
	}
	
	public static boolean isDuck(int num) 
	{
		while(num!=0)
		{
			if (num%10==0)
			{
				return true ;
			}
			num/=10;
		}
		return false ;
	}
}
