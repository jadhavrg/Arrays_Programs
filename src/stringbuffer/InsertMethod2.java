package stringbuffer;

public class InsertMethod2 
{
	public static void main(String[] args) 
	{
		String str = new String("world") ;
		StringBuffer buffer = new StringBuffer("hello") ;
		char [] ch = {'r', 'a', 'm', 'e', 's', 'h'} ;
		
		StringBuffer buffer2 = new StringBuffer() ;
		buffer2.insert(0, buffer) ;
		System.out.println(buffer2);
		buffer2.insert(buffer2.length(), ch) ;
		System.out.println(buffer2);
		buffer2.insert(buffer2.lastIndexOf("ramesh"), str) ;
		System.out.println(buffer2);
	}
}
