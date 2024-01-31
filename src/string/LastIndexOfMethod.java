package string;

import java.util.Scanner;

// IMPLEMENTATION OF LASTINDEXOF() METHOD
public class LastIndexOfMethod
{
	static String str ;
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the String value: ");
		str = scanner.next() ;
		scanner.close();
		
		LastIndexOfMethod obj = new LastIndexOfMethod() ;
		
		System.out.println(obj.lastIndexOf(67));
	}
	
	public int lastIndexOf(String s) 
	{
		for(int i=str.length()-1; i>=0; i--)
		{
			if (s.charAt(0)==str.charAt(i)) 
			{
				return i ;
			}
		}
		return -1 ;
	}
	
	public int lastIndexOf(char s) 
	{
		for(int i=str.length()-1; i>=0; i--)
		{
			if (s==str.charAt(i)) 
			{
				return i ;
			}
		}
		return -1 ;
	}
	
	public int lastIndexOf(int ascii) 
	{
		char ch =(char) ascii ;
		for(int i=str.length()-1; i>=0; i--)
		{
			if (ch==str.charAt(i)) 
			{
				return i ;
			}
		}
		return -1 ;
	}
}
