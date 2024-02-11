package javatpoint.Basic;

import java.util.Scanner;

public class ArmstrongNumber 
{
	
	public static boolean isArmstrong(int num, int count) 
	{
		int temp = num ;
		int sum = 0 ;
		while(num != 0 )
		{
			int rem = num % 10 ;
			int rem1=1 ;
			for(int i=1; i<=count; i++)
			{
				rem1 = rem1*rem ;
			}
			sum += rem1 ;
			num/=10 ;
		}
		if (temp==sum) 
		{
			return true ;
		}
		return false ;
	}
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the number: ");
		int num = scanner.nextInt() ;
		scanner.close();
		
		// FIND THE COUNT
		int count = 0 ;
		int temp = num ;
		while(num !=0)
		{
			count ++ ;
			num /=10 ;
		}
		
		if (isArmstrong(temp, count)) 
		{
			System.out.println(temp + " is a Armstrong Number.");
		}else
		{
			System.out.println(temp + " is not a Armstrong number.");
		}
		
	}
}
