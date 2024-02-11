package javatpoint.Number;

import java.util.Scanner;

// ISBN Number Java
public class ISBN_Number 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the number: ");
		long num = scanner.nextLong() ;
		scanner.close(); 
		
		if (isISBN(num))
		{
			System.out.println(num+" is ISBN Number.");
		}
		else
		{
			System.out.println(num+ " is not a ISBN Number.");
		}
	}
	
	public static boolean isISBN(long num) 
	{
		long temp = num ;
		long sum = 0 ;
		int i = 1 ;
		while(temp!=0)
		{
			long rem = temp%10 ;
			sum=sum+(rem*i++) ;
			temp/=10 ;
			
		}
		System.out.println(sum);
		return (sum%11==0) ;
	}
}
