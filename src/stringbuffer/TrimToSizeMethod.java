package stringbuffer;

public class TrimToSizeMethod
{
	public static void main(String[] args) 
	{
		StringBuffer buffer = new StringBuffer() ;
		System.out.println("Default Capacity: "+buffer.capacity()); //16
		buffer.append("1234567890123456") ;
		System.out.println("Capacity: " + buffer.capacity()); //16
		System.out.println("Length: " + buffer.length()); //16
		buffer.append("1") ;
		System.out.println("Capacity: " + buffer.capacity()); //34
		System.out.println("Length: " + buffer.length()); //17
		buffer.ensureCapacity(1000);
		
		for(int i=18; i<=1001; i++)
		{
			buffer.append("H") ;
		}
		
		System.out.println("Capacity: " + buffer.capacity()); //2002 
		System.out.println("Length: " + buffer.length()); // 1001
		
		buffer.trimToSize();
		System.out.println("Capacity: " + buffer.capacity()); //1001
		System.out.println("Length: " + buffer.length()); //1001
	}
}
