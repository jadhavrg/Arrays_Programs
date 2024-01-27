package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example2 
{
	public static void main(String[] args) 
	{
		String str = "abskhgjbmabcdkghkabc" ;
		Pattern pattern = Pattern.compile("abc") ;
		Matcher matcher = pattern.matcher(str) ;
		while(matcher.find())
		{
			System.out.println("Starting index of " + matcher.group()+ " is " + matcher.start()+ " and ending index is " + matcher.end());
		}
	}
}
