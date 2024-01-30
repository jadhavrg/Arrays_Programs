package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// WAJP TO PRINT THE SPECIAL CHARACTERS
public class PrintSpecialCharacters 
{
	public static void main(String[] args) 
	{
		String str = "DFGHJ#$%^&*34567#$%^&__+=9" ;
		
		Pattern pattern = Pattern.compile("\\W") ;
		Matcher matcher = pattern.matcher(str) ;
		
		while(matcher.find())
		{
			System.out.println(matcher.start()+ "------"+matcher.group());
		}
	}
}
