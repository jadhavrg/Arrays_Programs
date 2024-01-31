package stringbuffer;

public class AppendMethod1 
{
	public static void main(String[] args) 
	{
		StringBuffer buffer = new StringBuffer() ;
		System.out.println(buffer);
		System.out.println("Length: " + buffer.length()); //0
		buffer.append("RAMESH") ;
		System.out.println(buffer);
		System.out.println("Length: " + buffer.length()); //6
		buffer.append(100) ;
		System.out.println(buffer);
		System.out.println("Length: " + buffer.length()); //9
		buffer.append(false) ;
		System.out.println(buffer);
		System.out.println("Length: " + buffer.length()); //14
		buffer.append(10.0) ;
		System.out.println(buffer);
		System.out.println("Length: " + buffer.length()); //18
		buffer.append(12345678902L) ;
		System.out.println(buffer);
		System.out.println("Length: " + buffer.length()); //29
		buffer.append(1.1f) ;
		System.out.println(buffer);
		System.out.println("Length: " + buffer.length()); //32
	}
}
