package stringbuffer;

public class InsertMethod1 
{
	public static void main(String[] args) 
	{
		StringBuffer buffer = new StringBuffer("RAMESH") ;
		System.out.println(buffer);
		System.out.println("Length: " + buffer.length()); //6
		buffer.insert(0, "HELLO ") ;
		System.out.println(buffer);
		System.out.println("Length: " + buffer.length()); //12
		buffer.insert(0, "1.") ;
		System.out.println(buffer);
		System.out.println("Length: " + buffer.length()); //14
		buffer.insert(2, false) ;
		System.out.println(buffer);
		System.out.println("Length: " + buffer.length()); //19
		buffer.insert(buffer.indexOf("HELLO"), " ") ;
		System.out.println(buffer);
		System.out.println("Length: " + buffer.length()); //20
		buffer.append(" WORLD.") ;
		System.out.println(buffer);
		System.out.println("Length: " + buffer.length()); //27
		
	}
}
