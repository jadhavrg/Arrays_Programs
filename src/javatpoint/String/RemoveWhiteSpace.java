package javatpoint.String;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveWhiteSpace
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the String value: ");
		String str = scanner.nextLine() ;
		scanner.close(); 
		
//		str = str.replaceAll("\s", "") ;
//		
//		System.out.println("String after removing all the white spaces : " + str); 
		
		Pattern pattern = Pattern.compile("\\S") ;
		Matcher matcher = pattern.matcher(str) ;
		System.out.println("String after removing all the white spaces : "); 
		while(matcher.find())
		{
			System.out.print(matcher.group());
		}
	}
}
