package string;
//Implementation of concat(String str) method.
public class Concat 
{
	static String str ;
	public static void main(String[] args) 
	{
		str = "JAVA" ;
		
		Concat concat = new Concat() ;
		System.out.println(concat.concat(" PROGRAMMING"));
	}
	
	public String concat(String anoStr) 
	{
		return (str+anoStr) ;
	}
}
