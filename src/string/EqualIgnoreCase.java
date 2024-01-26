package string;
// Implementation of equalIgnoreCase(String str) method.
public class EqualIgnoreCase 
{
	static String str  ;
	public static void main(String[] args) 
	{
		str = "RushiKesh" ;
		
		EqualIgnoreCase obj = new EqualIgnoreCase() ;
		
		System.out.println(obj.equalIgnoreCaseMethod("rushikesh"));
	}
	
	public boolean equalIgnoreCaseMethod(String s)
	{
		String a = str.toLowerCase() ;
		String b = s.toLowerCase() ;
		return a.equals(b) ; 
	}
}
