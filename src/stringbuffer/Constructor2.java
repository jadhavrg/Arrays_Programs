package stringbuffer;
// CONSTRUCTOR WITH INT ARGUMENT
public class Constructor2 
{
	public static void main(String[] args)
	{
		StringBuffer buffer = new StringBuffer(10) ;
		System.out.println("Length: " + buffer.length());
		System.out.println("Capacity: " + buffer.capacity());
		
		buffer.append("1234567890") ;
		System.out.println("Length: " + buffer.length());
		System.out.println("Capacity: " + buffer.capacity());
		
		buffer.append("1") ;
		System.out.println("Length: " + buffer.length());
		System.out.println("Capacity: " + buffer.capacity());
		
		
		System.out.println("************************************");
		
		StringBuffer buffer2 = new StringBuffer(0) ;
		System.out.println("Length: " + buffer2.length());
		System.out.println("Capacity: " + buffer2.capacity());
		
		buffer2.append("1234567890") ;
		System.out.println("Length: " + buffer2.length());
		System.out.println("Capacity: " + buffer2.capacity());
		
		buffer2.append("1") ;
		System.out.println("Length: " + buffer2.length());
		System.out.println("Capacity: " + buffer2.capacity()) ;
		
//		StringBuffer buffer3 = new StringBuffer(-7) ;  //NegativeArraySizeException
		
		
	}
}
