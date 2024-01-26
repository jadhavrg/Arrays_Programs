package string;

import java.util.Arrays;

//Implementation of toCharArray() method.
public class ToCharArray 
{
	static String str ;
	public static void main(String[] args) 
	{
		str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" ;
		
		ToCharArray obj = new ToCharArray() ;
		char [] arr = obj.toCharArray() ;
		System.out.println(Arrays.toString(arr));
	}
	
	public char [] toCharArray() 
	{
		char [] ch = new char[str.length()] ;
		for(int i=0; i<str.length(); i++)
		{
			ch[i] = str.charAt(i) ;
		}
		return ch ;
	}
}
