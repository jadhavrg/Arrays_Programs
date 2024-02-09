package javatpoint.String;
// Java Program to swap two string variables without using third or temp variable.
public class SwapString 
{
	public static void main(String[] args) 
	{
		String str1 = "good" ;
		String str2 = "morning" ;
		
		System.out.println("Before Swapping: " + str1+ " "+ str2);
		
		str1 = str1+ str2 ;
		
		str2 = str1.substring(0, (str1.length()-str2.length()));
		
		System.out.println(str2);
		
		str1 = str1.substring((str2.length()), (str1.length())) ;
		
		System.out.println(str1);
		
		System.out.println("After Swapping: " + str1+ " "+ str2);
	}
}
