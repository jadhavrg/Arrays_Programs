package javatpoint.Number;

import java.util.Scanner;

// Tech Number in Java
public class TechNumber 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the number: ");
		int num = scanner.nextInt() ;
		scanner.close(); 
		
		int temp1 = num ;
		int count = 0 ;
		while(temp1 != 0)
		{
			count++ ;
			temp1/=10;
		}
		
		if (count%2!=0) 
		{
			System.out.println(num + " is not a tech number.");
		}
		else
		{
			int temp = num ;
			int firstHalt = (int) (temp % Math.pow(10, count/2)) ;
			int secontHalt = (int) (temp / Math.pow(10, count/2)) ;
			
			int square = (firstHalt+secontHalt)*(firstHalt+secontHalt) ;
			
			if (square==num) 
			{
				System.out.println(num+ " is a tech number.");
			}
			else
			{
				System.out.println(num + " is not a tech number.");
			}
		}
	}
}
