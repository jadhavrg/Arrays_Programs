package javatpoint.String;
// Reverse String in Java Word by Word
public class ReverseString1 
{
	public static void main(String[] args) 
	{
		String str = "Java is Programming language" ;
		StringBuffer newStr = new StringBuffer() ;
		String [] arr = str.split(" ") ;
		
		for(int i=arr.length-1; i>=0; i--)
		{
			newStr= newStr.append(arr[i])  ;
			newStr.append(" ") ;
		}
		
		System.out.println(newStr);
	}
}
