package stringbuffer;

public class EnsureCapacityMethod 
{
	public static void main(String[] args) 
	{
		StringBuffer buffer = new StringBuffer() ;
		System.out.println(buffer.capacity()); //16
		buffer.ensureCapacity(100);
		System.out.println(buffer.capacity()); //100
		
		StringBuffer buffer2 = new StringBuffer(100) ;
		System.out.println(buffer2.capacity()); //100
		buffer2.ensureCapacity(200);
		System.out.println(buffer2.capacity()); //202
		
		StringBuffer buffer3 = new StringBuffer(300) ;
		System.out.println(buffer3.capacity()); //300
		buffer3.ensureCapacity(700);
		System.out.println(buffer3.capacity()); //700
		
		StringBuffer buffer4 = new StringBuffer(100) ;
		System.out.println(buffer4.capacity()); //100
		buffer4.ensureCapacity(100);
		System.out.println(buffer4.capacity()); //100
		
		StringBuffer buffer5 = new StringBuffer() ;
		System.out.println(buffer5.capacity()); //16
		buffer5.ensureCapacity(10);
		System.out.println(buffer5.capacity()); //16
		
		StringBuffer buffer6 = new StringBuffer() ;
		System.out.println(buffer6.capacity()); //16
		buffer6.ensureCapacity(-45);
		System.out.println(buffer6.capacity()); //16
	}
}
