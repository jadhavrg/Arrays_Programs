package string;
//Implementation of endWith(String str) method.
public class EndsWith 
{
	static String str ;
	public static void main(String[] args) 
	{
		str = "RAMESH" ;
		
		EndsWith obj = new EndsWith() ;
		System.out.println(obj.endsWith("ESH"));
	}
	
	public boolean endsWith(String s) 
	{
		boolean flag = true ;
		int j = str.length()-1 ;
		for(int i=s.length()-1; i>=0; i--,j--)
		{
			if (s.charAt(i) != str.charAt(j)) 
			{
				flag = false ;
				break ;
			}
		}
		
		return flag ;
	}
}
