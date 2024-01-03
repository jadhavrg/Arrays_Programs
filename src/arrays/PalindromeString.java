package arrays;

public class PalindromeString 
{
	public static boolean isPalindrome(String name)
	{
		String rev = "" ;
		for(int i=name.length()-1; i>=0; i--)
		{
			rev += name.charAt(i) ;
		}
		if (name.equals(rev)) 
		{
			return true ;
		}
		return false ;
	}
	
	public static void main(String[] args) 
	{
		String [] names = {"rushi", "naman", "madam", "vishal", } ;
		
		for (String name : names) 
		{
			if (isPalindrome(name))
			{
				System.out.println(name);
			}
		}
	}
}
