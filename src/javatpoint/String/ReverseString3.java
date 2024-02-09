package javatpoint.String;
// Java Program to find Reverse of the string
public class ReverseString3 
{
	public static void main(String[] args) 
	{
		String str = "Dream Big" ;
		
		System.out.println("Original String: " + str);
		
		String newStr = "" ;
		
		for(int i=str.length()-1; i>=0; i--)
		{
			newStr += str.charAt(i) ;
		}
		
		System.out.println("Reverse String: "+newStr);
	}
}
