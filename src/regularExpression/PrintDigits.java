package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// WAJP TO PRINT ONLY DIGITS WITH ITS INDEX FROM STRING
public class PrintDigits 
{
	public static void main(String[] args) 
	{
		String str = "dfghjklDFGHJK#$%^&*345678" ;
		
		Pattern pattern = Pattern.compile("\\d") ;
		Matcher matcher = pattern.matcher(str) ;
		while(matcher.find())
		{
			System.out.println(matcher.start()+ "---------" + matcher.group());
		}
	}
}
