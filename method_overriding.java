package adifa;

public class method_overriding 
{
	public void display()
	{
		System.out.println("I am in lab");
	}
	
	public static class java extends method_overriding
	{
		public void display()
		{
			System.out.println("I am in java lab");
		}
	}
	
	public static void main(String[] args) 
		{
			java j = new java();
			j.display();

		}
}
