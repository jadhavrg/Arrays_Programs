package string;

public class StringExample1 
{
	public static void main(String[] args) 
	{
		String a = new String("Hello") ;
		String b = new String("Hello") ;
		System.out.println(a==b);  // false- because two objects are created in heap area.
		System.out.println(a.equals(b)); // true 
		
		String c = "hiii" ;
		String d = "hiii" ;
		System.out.println(c==d); // true- because only one object is created in String constant pool area and reference is given to the both objects.
		System.out.println(c.equals(d)); // true
		
		String e = "bye" ;
		String f = new String("bye") ;
		System.out.println(e==f); // false- because two objects are created.
		System.out.println(e.equals(f)); // true
	}
}
