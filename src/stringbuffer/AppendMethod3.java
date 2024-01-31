package stringbuffer;

public class AppendMethod3 
{
	public static void main(String[] args) 
	{
		String str = new String("JAVA") ;
		StringBuilder builder = new StringBuilder(" PROGRAMMING") ;
		
		StringBuffer buffer = new StringBuffer() ;
		buffer.append(str) ;
		buffer.append(builder) ;
		System.out.println(buffer); // JAVA PROGRAMMING
	}
}
