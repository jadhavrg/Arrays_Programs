package regularExpression;
// WAJP TO REMOVE THE WHITE SPACES IN A STRING.
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveSpace 
{
	public static void main(String[] args) 
	{
		String str = "nkjdfh#$%^5678  iuookh7T OEUS ;UKJBV _-=-7_+" ;
		
		Pattern pattern = Pattern.compile("\\S") ;
		Matcher matcher = pattern.matcher(str) ;
		while(matcher.find())
		{
			System.out.print(matcher.group());
		}
	}
}
