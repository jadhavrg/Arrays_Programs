package string;
//Implementation of codePointCount(int startInd, int endInd) method.
public class CodePointCount 
{
	static String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" ;
	public static void main(String[] args) 
	{
		CodePointCount obj = new CodePointCount() ;
		System.out.println("Count is: " + obj.codePointCountMethod(0,26));
		
	}
	
	public int codePointCountMethod(int startInd, int endInd)
	{
		if (startInd >=0 && endInd<=str.length() && startInd <= endInd) 
		{
			return(endInd-startInd) ;
		}
		else
		{
			throw new StringIndexOutOfBoundsException("WRONG INDEX") ;
		}
	}
}
