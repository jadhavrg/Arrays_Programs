package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// WAJP TO FIND UPPERCASE CHARACTER FROM A STRING.
public class FindUppercase 
{
	public static void main(String[] args) 
	{
		String str = "shndABClfjknDEFfjhdjGHT" ;
		
		Pattern pattern = Pattern.compile("[A-Z]") ;
		Matcher matcher = pattern.matcher(str) ;
		System.out.println("Uppercase Characters are: ");
		while(matcher.find())
		{
			System.out.print(matcher.group());
		}
	}
}
