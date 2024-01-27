package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//WAJP TO FIND DIGITS CHARACTER FROM A STRING.
public class FindDigits
{
	public static void main(String[] args) 
	{
		String str = "jfsdh65874%*&^jsgc" ;
		
		Pattern pattern = Pattern.compile("[0-9]") ;
		Matcher matcher = pattern.matcher(str) ;
		System.out.println("The Digits are: ");
		while(matcher.find())
		{
			System.out.print(matcher.group());
		}
		System.out.println();
		Pattern pattern2 = Pattern.compile("[^0-9]") ;
		Matcher matcher2 = pattern2.matcher(str) ;
		System.out.println("The remaining characters are: ");
		while(matcher2.find())
		{
			System.out.print(matcher2.group());
		}
	}
}
