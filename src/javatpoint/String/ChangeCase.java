package javatpoint.String;

import java.util.Scanner;

// Java Program to replace lower-case characters with upper-case and vice-versa
public class ChangeCase 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the String value: ");
		String str = scanner.nextLine();
		scanner.close();
		StringBuffer newStr = new StringBuffer(str) ;
		
		for(int i=0; i<str.length(); i++)
		{
			if (Character.isUpperCase(str.charAt(i))) 
			{
				newStr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
			else
			{
				newStr.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			}
		}
		
		System.out.println(newStr);
	}
}
