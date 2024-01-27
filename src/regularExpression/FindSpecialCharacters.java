package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// WAJP TO FIND THE SPECIAL CHARACTERS FROM A STRING.
public class FindSpecialCharacters 
{
	public static void main(String[] args) 
	{
		String str = "KGYUr6fyh765$^&*iyfh(%*---))__=+" ;
		
		Pattern pattern = Pattern.compile("[^a-zA-Z0-9]") ;
		Matcher matcher = pattern.matcher(str) ;
		System.out.println("The Special characters are: ");
		while(matcher.find())
		{
			System.out.println(matcher.group());
		}
		
		Pattern pattern2 = Pattern.compile("[a-zA-Z0-9]") ;
		Matcher matcher2 = pattern2.matcher(str) ;
		System.out.println("The remaining characters are: ");
		while(matcher2.find())
		{
			System.out.println(matcher2.group());
		}
	}
}
