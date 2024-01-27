package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 
{
	public static void main(String[] args) 
	{
		String name = "RUSHIKESH" ;
		Pattern pattern = Pattern.compile("S") ;
		Matcher matcher = pattern.matcher(name) ;
		while(matcher.find())
		{
			System.out.println("Starting index of " + matcher.group()+ " is " + matcher.start());
		}
	}
}
