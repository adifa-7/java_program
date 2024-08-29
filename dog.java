package adifa;

public class dog {
	String name, colour;
	
	public dog(String n, String c)
	{
		name = n;
		colour = c;
	}

	public static void main(String[] args) {
		dog myObj = new dog("Me","purple");
		System.out.println("Name: " + myObj.name + "\nColour: " + myObj.colour);

	}

}
