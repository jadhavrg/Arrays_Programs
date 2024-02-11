package javatpoint.Number;

import java.util.Scanner;

// Krishnamurthy OR Strong Number Java
public class Krishnamurthy_Or_Strong_Number
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the number: ");
		int num = scanner.nextInt() ;
		scanner.close(); 
		
		if (isStrong(num)) 
		{
			System.out.println(num+" is a Strong Number.");
		}
		else
		{
			System.out.println(num+" is not a Strong number.");
		}
	}
	
	public static boolean isStrong(int num) 
	{
		int temp = num ;
		int sum = 0 ;
		
		while(temp!=0)
		{
			int product = 1 ;
			int rem = temp%10 ;
			for(int i=1; i<=rem; i++)
			{
				product *= i ;
			}
			sum+=product ;
			temp/=10 ;
		}
		return (sum==num) ;
	}
}
