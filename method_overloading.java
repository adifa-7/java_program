package adifa;

public class method_overloading {
	public static int Sum(int x)
	{
		return (x+x);
	}
	public static int Sum(int x, int y)
	{
		return (x+y);
	}
	public static double Sum(double x, double y)
	{
		return (x+y);
	}

	public static void main(String[] args) 
	{	
		method_overloading a = new method_overloading ();
		System.out.println("single parameter: " + a.Sum(5));
		System.out.println("multiple parameters: " + a.Sum(10,7));
		System.out.println("other datatype parameters: " + a.Sum(2.5,6.5));
	}
}
