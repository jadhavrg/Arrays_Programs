package stringbuffer;

public class CapacityMethod
{
	public static void main(String[] args) 
	{
		StringBuffer buffer = new StringBuffer() ;
		System.out.println(buffer.capacity());
		
		StringBuffer buffer2 = new StringBuffer("RUSHIKESH") ;
		System.out.println(buffer2.capacity());
		
		StringBuffer buffer3 = new StringBuffer(100) ;
		System.out.println(buffer3.capacity());
	}
}
