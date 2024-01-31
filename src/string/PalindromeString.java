package string;

import java.util.Scanner;

// WAJP TO VHECK WHETHER STRING IS PALIMDROME OR NOT.
public class PalindromeString 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the String value: ");
		String str = scanner.next() ;
		scanner.close(); 
		
		String reverse = getReverse(str) ;
		
		if (reverse.equals(str)) 
		{
			System.out.println(str + " is a palindrome number.");
		}
		else
		{
			System.out.println(str + " is not a palindrome number.");
		}
		
	}
	
	public static String getReverse(String s) 
	{
		String reverse = "" ;
		
		for(int i=(s.length()-1); i>=0; i--)
		{
			reverse += s.charAt(i) ;
		}
		return reverse ;
	}
}
