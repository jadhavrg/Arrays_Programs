package wrapperClasses;

public class AutoBoxing1 
{
	public static void main(String[] args) 
	{
		int a = 10 ;
		System.out.println(a); //10
		Integer integer = a ;
		System.out.println(integer); //10
		Integer integer2 = Integer.valueOf(a) ;
		System.out.println(integer2); //10
		
		String b = "20" ;
		Byte byte1 = Byte.valueOf(b) ;
		System.out.println(byte1); //20
	}
}
