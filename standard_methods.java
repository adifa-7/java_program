package adifa;

public class standard_methods {
	
	public static void mySqrt()
	{
		int x = 25;
		System.out.println(Math.sqrt(x));
	}
	public static void upper()
	{
		String a = new String("hello");
		System.out.println(a.toUpperCase());
	}
	public static void lower()
	{
		String b = new String("HELLO");
		System.out.println(b.toLowerCase());
	}
	public static void numLength()
	{
		String y = new String("Adifa Saniya");
		System.out.println(y.length());
	}
	public static void main(String[] args) 
	{
		mySqrt();
		upper();
		lower();
		numLength();

	}

}
