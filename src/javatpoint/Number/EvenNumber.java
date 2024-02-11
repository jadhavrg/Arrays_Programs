package javatpoint.Number;

import java.util.Scanner;

// Java Program to Display Even Numbers From 1 to 100
public class EvenNumber 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the Strating number: ");
		int start = scanner.nextInt() ;
		System.out.println("Enter the Ending number: ");
		int end = scanner.nextInt() ;
		scanner.close(); 
		
		System.out.print("The even Numbers are: ");
		for(int i=start;i<=end;i++)
		{
			if (i%2==0) 
			{
				System.out.print(i+", ");
			}
		}
	}
}
