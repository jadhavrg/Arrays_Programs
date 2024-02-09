package javatpoint.String;
// Java Program to replace the spaces of a string with a specific character
public class ReplaceSpace 
{
	public static void main(String[] args) 
	{
		String str = "java is programming langiage" ;
		
		str = str.replace(" ", "-") ;
		System.out.println(str);
	}
}
