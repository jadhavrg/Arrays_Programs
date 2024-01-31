package stringbuffer;
// NO ARGUMENT CONSTRUCTOR

public class Constructor1 
{
	public static void main(String[] args) 
	{
		StringBuffer buffer = new StringBuffer() ;
		System.out.println("Capacity: "+buffer.capacity());
		System.out.println("Length: "+buffer.length());
	}
}
