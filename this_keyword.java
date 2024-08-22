package adifa;

import java.util.Scanner;
public class this_keyword 
{
	void age()
	{
		this.name();
		Scanner a = new Scanner(System.in);
		System.out.println("enter your age: ");
		String s  = a.nextLine();
		System.out.println("age: " + s);
	}
	void name()
	{
		Scanner n = new Scanner(System.in);
		System.out.println("enter your name: ");
		String p = n.nextLine();
		System.out.println("Name: " + p);

	}
	public static void main(String[] args) {
		this_keyword t = new this_keyword();
		t.age();
	
	}
}
