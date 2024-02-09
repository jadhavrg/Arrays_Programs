package javatpoint.String;

import java.util.Scanner;

// Java Program to divide a string in 'N' equal parts.
public class DivideString 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the String value: ");
		String str = scanner.next() ;
		
		System.out.println("How many parts the String didvided: ");
		int n = scanner.nextInt() ;
		scanner.close();

		int length = str.length() ;
		String [] equalStr = new String[n] ;
		int temp = 0 ;
		int chars = length /n ; 
		
		if (length%n != 0) 
		{
			System.out.println("Sorry this string cannot be divided into "+ n +" equal parts.");
		}
		else
		{
			for(int i=0; i<length; i+=chars)
			{
				String part = str.substring(i, i+chars) ;
				equalStr[temp++] = part ;
			}
			
			 System.out.println(n + " equal parts of given string are ");  
			for(String s: equalStr)
			{
				System.out.println(s);
			}
		}
		
		
		
	}
}
