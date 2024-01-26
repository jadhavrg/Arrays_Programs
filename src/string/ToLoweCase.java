package string;
//Implementation of toLowerCase() method.
import java.util.Scanner;

public class ToLoweCase 
{
	static String str ;
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Please enter the String: ");
		str = scanner.next() ;
		scanner.close();
		
		ToLoweCase obj = new ToLoweCase() ;
		System.out.println("Converted String is: " + obj.toLowerCaseMethod());
	}
	
	String toLowerCaseMethod()
	{
		String newStr = "" ;
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i) ;
			if (ch>=65 && ch<=90) 
			{
				newStr += (char) (ch+32) ;
			}
			else
			{
				newStr+= ch ;
			}
		}
		return newStr ;
	}
}
