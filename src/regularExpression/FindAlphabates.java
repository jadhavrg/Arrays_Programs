package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// WAJP TO FIND ALPHABATES FROM STRING (LOWERCASE AND UPPERCASE)
public class FindAlphabates
{
	public static void main(String[] args)
	{
		String str = "jhJASGujdbGDIUD68754$&*&klt" ;
		
		Pattern pattern = Pattern.compile("[a-zA-Z]") ;
		Matcher matcher = pattern.matcher(str) ;
		System.out.println("The alphabates are: ");
		while(matcher.find())
		{
			System.out.println(matcher.group()); 
		}
		
		
		Pattern pattern2 = Pattern.compile("[^a-zA-Z]") ;
		Matcher matcher2 = pattern2.matcher(str) ;
		System.out.println("The remaining characters are: ");
		while(matcher2.find())
		{
			System.out.println(matcher2.group());
		}
	}
}
