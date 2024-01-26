package string;
//Implementation of toUpperCase() method.
import java.util.Scanner;

public class ToUpperCase 
{
	static String str ;
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the String: ");
		str = scanner.next() ;
		scanner.close();
		
		ToUpperCase ab = new ToUpperCase() ;
		System.out.println("Converted string is: "+ab.toUpperCaseMethod());
	}
	
	public String toUpperCaseMethod()
	{
		String newStr = "" ;
		
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i) ;
			if (ch>=97 && ch<123) 
			{
				newStr += (char)(ch-32) ;
			}
			else
			{
				newStr += ch ;
			}
		}
		
		return newStr ;
	}
}
