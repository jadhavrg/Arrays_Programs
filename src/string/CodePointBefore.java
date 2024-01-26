package string;
//Implementation of codePointBefore(int index) method.
public class CodePointBefore 
{
	static String str ;
	public static void main(String[] args) 
	{
		str = "ABCDEFGHI" ;
		
		CodePointBefore ca = new CodePointBefore() ;
		System.out.println(ca.codePointBeforeMethod(5));
	}
	
	int codePointBeforeMethod(int index)
	{
		if(index>0 && index<=str.length())
		{
			return str.charAt(index-1) ;
		}
		else
		{
			throw new StringIndexOutOfBoundsException("WRONG INDEX") ;
		}
	}
}
