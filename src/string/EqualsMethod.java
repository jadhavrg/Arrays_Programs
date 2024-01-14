package string;


public class EqualsMethod 
{
	String str ;
	public static void main(String[] args) 
	{
		EqualsMethod em = new EqualsMethod() ;
		em.str = "Hello" ;
		String b = "Hello" ;
		
		System.out.println(em.equal(b));
	}
	
	public boolean equal(String s) 
	{
		if (s==str) 
		{
			return true ;
		}
		return false ;
	}
}
