package adifa;

import java.util.Scanner;
public class person {
	public void getFirstName()
	{
		Scanner fname = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String f = fname.nextLine();
		System.out.println("First name is: " + f);
	}
	public void getLastName()
	{
		Scanner lname = new Scanner(System.in);
		System.out.println("enter last name: ");
		String l = lname.nextLine();
		System.out.println("Last name is: " + l);
	}
	public class employee extends person {
		public void employeeId()
		{
			Scanner id = new Scanner(System.in);
			System.out.println("Enter employee id: ");
			int e = id.nextInt();
			System.out.println("My id is:" + e);
		}
		public void getLastName()
		{
			Scanner name = new Scanner(System.in);
			System.out.println("Enter job title: ");
			String n = name.nextLine();
			System.out.println("Job title: " + n);
			
		}
	}

	public static void main(String[] args) {
		person a = new person();
		person.employee in = a.new employee();
		in.getFirstName();
		in.getLastName();
		in.employeeId();

	}

}
