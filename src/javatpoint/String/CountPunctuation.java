package javatpoint.String;
// Java Program to Count the Total Number of Punctuation Characters Exists in a String
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountPunctuation 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the String value: ");
		String str = scanner.nextLine() ;
		scanner.close();
		
		Pattern pattern = Pattern.compile("[^a-zA-Z0-9]") ;
		Matcher matcher = pattern.matcher(str) ;
		
		int count = 0 ;
		while(matcher.find())
		{
				count++ ;
		}
		
		System.out.println("Count of Punctuation Marks is: " + count);
	}
}
