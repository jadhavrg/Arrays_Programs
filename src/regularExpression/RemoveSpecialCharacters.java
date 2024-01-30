package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// WAJP TO REMOVE SPECIAL CHARACTERS FROM A STRINGBUFFER.
public class RemoveSpecialCharacters 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("Java!@#98%&965$%^&Programming") ;
		
		String str = new String(sb) ;
		
		Pattern pattern = Pattern.compile("[^a-zA-Z0-9]") ;
		Matcher matcher = pattern.matcher(str) ;
		
		int cc = 0 ;
		
		while(matcher.find())
		{
			int ind = matcher.start()-cc ;
			sb.delete(ind, ind+1) ;
			cc++ ;
		}
		
		System.out.println(sb);
		
	}
}
