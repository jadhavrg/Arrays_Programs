package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// WAJP TO PRINT THE OTHER CHARACHERS WITH ITS INDEX THAN THE DIGITS.
public class PrintOtherCharactersThanDigits 
{
	public static void main(String[] args) 
	{
		String str = "DFGHJKrtyuio4567890#$%^&*(" ;
		
		Pattern pattern = Pattern.compile("\\D") ;
		Matcher matcher = pattern.matcher(str) ;
		while(matcher.find())
		{
			System.out.println(matcher.start()+ "---------" + matcher.group());
		}
	}
}
