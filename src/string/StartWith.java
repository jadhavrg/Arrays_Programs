package string;
//Implementation of startWith(String str) method.

public class StartWith 
{
	static String str ;
	public static void main(String[] args) 
	{
		str = "Ramesh" ;
		String srch = "Ram" ;
		StartWith obj = new StartWith() ;
		
		System.out.println(obj.startWith(srch));
	}
	
	public boolean startWith(String srch)
	{
		boolean flag = true ;
		
		for(int i=0; i<srch.length(); i++)
		{
			if (srch.charAt(i) != str.charAt(i)) 
			{
				flag = false ;
				break ;
			}
		}
		
		return flag ;
	}
}
