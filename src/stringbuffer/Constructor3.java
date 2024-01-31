package stringbuffer;
// CONSTRUCTOR WITH STRING ARGUMENT
public class Constructor3 
{
	public static void main(String[] args) 
	{
		StringBuffer buffer = new StringBuffer("RAMESH") ;
		System.out.println("Length: " + buffer.length());
		System.out.println("Capacity: " + buffer.capacity());
	}
}
