package javatpoint.String;

import java.util.Scanner;

// Java Program to determine whether a given string is palindrome
public class PalindromeString 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the String value: ");
		String str = scanner.next() ;
		scanner.close(); 
		
		StringBuffer buffer = new StringBuffer(str) ;
		buffer=buffer.reverse() ;
		String reverse = new String(buffer);
		
		if (str.equals(reverse)) 
		{
			System.out.println("Given string is palindrome");
		}else
		{
	        System.out.println("Given string is not a palindrome");
		}
	}
}
