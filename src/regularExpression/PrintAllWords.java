package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// WAJP TO PRINT THE ALL WORDS ALSO PRINT THE UNDESCORE 
public class PrintAllWords 
{
	public static void main(String[] args)
	{	
		String str = "dfghjk$%^&*(dfghjklDF__GHJ#$%^&*34567" ;
		
		Pattern pattern = Pattern.compile("\\w") ;
		Matcher matcher = pattern.matcher(str) ;
		while(matcher.find())
		{
			System.out.println(matcher.start()+"---------"+matcher.group());
		}
	}
}
