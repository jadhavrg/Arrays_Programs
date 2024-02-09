package javatpoint.String;

import java.util.Arrays;
import java.util.Scanner;

// Java Program to determine whether two strings are the anagram
public class Anagram 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the First String value: ");
		String str1 = scanner.next() ;
		System.out.println("Enter the Second String value: ");
		String str2 = scanner.next() ;
		scanner.close();
		
		str1 =str1.toLowerCase() ;
		str2 =str2.toLowerCase() ;
		
		if (str1.length()==str2.length()) 
		{
			char [] ch1 = str1.toCharArray() ;
			char [] ch2 = str2.toCharArray() ;
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			if (Arrays.equals(ch1, ch2)) 
			{
				System.out.println("Both the strings are anagram");
			}
			else
			{
				System.out.println("Both the strings are not anagram");
			}
		}
		else
		{
			System.out.println("Both the strings are not anagram");
		}
	}
}
