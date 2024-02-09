package javatpoint.String;

import java.util.Scanner;

// Java Program to count the total number of vowels and consonants in a string
public class CountVowelsAndConsonants
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("ENter the String value: ");
		String str = scanner.nextLine() ;
		scanner.close(); 
		
		int vowelCount = 0 ;
		int consonentCount = 0 ;
		
		for(int i=0; i<str.length(); i++)
		{
			if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
			{
				vowelCount ++ ;
			}
			else if(str.charAt(i) == ' ')
			{
				
			}
			else
			{
				consonentCount ++ ;
			}
		}
		
		System.out.println("Count of vowels is: " + vowelCount);
		System.out.println("Count of consonants is: " + consonentCount);
	}
}
