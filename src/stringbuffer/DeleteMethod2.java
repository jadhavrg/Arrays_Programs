package stringbuffer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DeleteMethod2 
{
	public static void main(String[] args) 
	{
		StringBuffer buffer = new StringBuffer("ASDJKwe$%^uio23456789)(*&^%$#@") ;
		String str = new String(buffer) ;
		
		Pattern pattern = Pattern.compile("[^a-zA-Z0-9]") ;
		Matcher matcher = pattern.matcher(str) ;
		int c = 0 ;
		while(matcher.find())
		{
			int ind = matcher.start()-c ;
			buffer.delete(ind, ind+1) ;
			c++ ;
		}
		
		System.out.println(buffer);
		
	}
}
