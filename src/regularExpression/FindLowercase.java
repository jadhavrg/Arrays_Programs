package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//WAJP TO FIND LOWERCASE CHARACTER FROM A STRING.
public class FindLowercase 
{
	public static void main(String[] args) 
	{
		String str = ",DGHKDJNrusJFBhikMFBJesh" ;
		Pattern pattern = Pattern.compile("[a-z]") ;
		Matcher matcher = pattern.matcher(str) ;
		System.out.println("Lowercase characters are: ");
		while(matcher.find())
		{
			System.out.print(matcher.group());
		}
		
		Pattern pattern2 = Pattern.compile("[^a-z]") ;
		Matcher matcher2 = pattern2.matcher(str) ;
		System.out.println("Remaining characters are: ");
		while(matcher2.find())
		{
			System.out.print(matcher2.group());
		}
	}
}
