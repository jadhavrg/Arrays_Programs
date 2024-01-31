package stringbuffer;

public class DeleteMethod1 
{
	public static void main(String[] args) 
	{
		StringBuffer buffer = new StringBuffer("HHEELLO_WORLD") ;
		buffer.delete(0, 1) ;
		System.out.println(buffer);
		buffer.delete(1, 2) ;
		System.out.println(buffer);
		buffer.delete(buffer.indexOf("_"), buffer.indexOf("_")+1) ;
		System.out.println(buffer);
	}
}
