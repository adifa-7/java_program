package adifa;

public class inheritance 
{
	int salary = 60000;
	
	public static class engineer extends inheritance 
	{
		int bonus = 10000;
	}
	
	public static void main(String[] args) 
	{
		engineer e1 = new engineer();
		System.out.println("salary: " + e1.salary + "\nbonus: " + e1.bonus);
	}

}
