package adifa;

public class shape {
	public void getArea()
	{
		System.out.println("I am here");
	}
	public class rectangle extends shape {
		public void getArea()
		{
			int l = 10;
			int b = 10;
			System.out.println("Area: " + l*b);
		}
	}
	
	public static void main(String[] args) {
		shape a = new shape();
		shape.rectangle in = a.new rectangle();
		in.getArea();

	}
	
}
