package stringbuffer;

public class DeleteCharAtMethod 
{
	public static void main(String[] args) 
	{
		StringBuffer buffer = new StringBuffer("HELLO_WORLD") ;
		System.out.println(buffer);
		buffer.deleteCharAt(buffer.indexOf("L")) ;
		System.out.println(buffer);
		buffer.deleteCharAt(buffer.lastIndexOf("L")) ;
		System.out.println(buffer);
		
//		buffer.deleteCharAt(-1) ; //StringIndexOutOfBoundsException
//		buffer.deleteCharAt(buffer.length()) ; //StringIndexOutOfBoundsException
		
	}
}
