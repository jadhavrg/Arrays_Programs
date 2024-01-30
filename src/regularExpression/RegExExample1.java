package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExExample1 
{
	public static void main(String[] args) 
	{
		String str = "abcaakdlgdthbhaaiknkbbjaa" ;
		
		Pattern pattern = Pattern.compile("b.aa") ;
		Matcher matcher = pattern.matcher(str) ;
		while(matcher.find())
		{
			System.out.println(matcher.start()+ "---------" + matcher.group());
		}
	}
}
