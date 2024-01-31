package stringbuffer;

import java.util.Arrays;

public class AppendMethod2 
{
	public static void main(String[] args) 
	{
		String str = "RAMESH" ;
		char [] ch = str.toCharArray() ;
		System.out.println(Arrays.toString(ch));
		StringBuffer buffer = new StringBuffer() ;
		buffer.append(ch,0,3) ;
		System.out.println(buffer); //RAM
		
		StringBuffer buffer2 = new StringBuffer() ;
		buffer2.append(ch) ;
		System.out.println(buffer2); //RAMESH
		
	}
}
