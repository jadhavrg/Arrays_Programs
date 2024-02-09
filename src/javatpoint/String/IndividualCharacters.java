package javatpoint.String;

import java.util.Scanner;

// Java Program to separate the Individual Characters from a String
public class IndividualCharacters 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the String value: ");
		String str = scanner.next() ;
		scanner.close();
		
		System.out.println("Individual characters from given string: ");
		
		for(int i=0; i<str.length();i++)
		{
			System.out.print(str.charAt(i) + " ");
		}
	}
}
