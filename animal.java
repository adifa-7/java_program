package adifa;

public class animal {
	public void move()
	{
		System.out.println("it is moving");
	}
	
	public class cheetah extends animal {
		public void move()
		{
			System.out.println("to run");
		}
	}

	public static void main(String[] args) {
		animal a = new animal();
		animal.cheetah in = a.new cheetah();
		in.move();

	}

}
