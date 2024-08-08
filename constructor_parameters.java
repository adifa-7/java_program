package adifa;

public class constructor_parameters {
	int x;
	public constructor_parameters(int y)
	{
		x = y;
	}
	public static void main(String[] args) {
		constructor_parameters myObj = new constructor_parameters(7);
		System.out.println(myObj.x);

	}

}
