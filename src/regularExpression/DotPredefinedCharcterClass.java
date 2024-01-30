package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DotPredefinedCharcterClass 
{
	public static void main(String[] args) 
	{
		String str = "java234567@#$%^&*()Programming" ;
		
		Pattern pattern = Pattern.compile(".") ;
		Matcher matcher = pattern.matcher(str) ;
		while(matcher.find())
		{
			System.out.println(matcher.start()+ "---------" + matcher.group());
		}
	}
}
