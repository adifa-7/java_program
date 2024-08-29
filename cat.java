package adifa;

public class cat {
	String name;
	int age;
	
	public cat()
	{
		name = "Unknown";
		age = 0;
	}
	public static void main(String[] args) {
		cat myName = new cat();
		cat myAge = new cat();
		System.out.println("Name: " + myName.name);
		System.out.println("Age: " + myAge.age);

	}

}
