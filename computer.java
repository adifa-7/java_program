package adifa;

public class computer {
	
	public class processor
	{
		int speed;
		String brand;
		public void displayDetails()
		{
			brand = "Dell";
			speed = 64;
			System.out.println("Brand: " + brand);
			System.out.println("Speed: " + speed);
		}
	}

	
public static void main(String[] args) 
	{
		computer myObj =new computer();
		computer.processor in = myObj.new processor();
		in.displayDetails();
	}

}
