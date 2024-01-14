package string;

public class CodePointAtMethod 
{
	String name ;
	public static void main(String[] args)
	{
		CodePointAtMethod cp = new CodePointAtMethod() ;
		
		cp.name = "RAMESH" ;
		
		for(int i=0; i<cp.name.length(); i++)
		{
			System.out.println(cp.findCodePoint(i));
		}
		
	}
	
	public int findCodePoint(int index) 
	{
		char ch = ' ' ;
		
		try {
			ch = name.charAt(index) ;
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("U HAVE ENTERED WRONG INDEX");
		}
		return ch ;
	}
}
