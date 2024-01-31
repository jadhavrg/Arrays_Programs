package string;

import java.util.Scanner;

public class AnagramString
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the String value: ");
		String str1 = scanner.next() ;
		System.out.println("Enter the String value: ");
		String str2 = scanner.next() ;
		scanner.close(); 
		
		System.out.println(checkAnagram(str1, str2));
		
	}
	
	public static boolean checkAnagram(String str1, String str2) 
	{
		boolean flag = true ;
		for(int i=0; i<str1.length(); i++)
		{
			for(int j=0; j<str2.length(); j++)
			{
				if (str1.charAt(i) != str2.charAt(j)) 
				{
					flag = false ;
					
				}
			}
		}
		return flag ;
	}
}
