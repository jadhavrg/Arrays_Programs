package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//WAJP TO PRINT THE SPACE INDEXES IN A STRING
public class PrintSpaceIndex 
{
	public static void main(String[] args) 
	{
		String str = " AS DfSD FGHJs dfgh 345 #$%^ ";
		
		Pattern pattern = Pattern.compile("\\s") ;
		Matcher matcher = pattern.matcher(str) ;
		
		while(matcher.find())
		{
			System.out.println(matcher.start() + "--------" + matcher.group());
		}
	}
}
