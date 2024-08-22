package adifa;

import java.util.Scanner;
public class scanner_class 
{
	public static void main(String[] args) 
	{
		Scanner name = new Scanner(System.in);
		Scanner roll = new Scanner(System.in);
		Scanner branch = new Scanner(System.in);
		Scanner college = new Scanner(System.in);
		System.out.println("enter student name: ");
		String n = name.nextLine();
		System.out.println("enter student rollno: ");
		String r = roll.nextLine();
		System.out.println("enter student branch: ");
		String b = branch.nextLine();
		System.out.println("enter student college: ");
		String c = college.nextLine();
		System.out.println("Name: " + n);
		System.out.println("Roll no: " + r);
		System.out.println("Branch: " + b);
		System.out.println("College: " + c);
	}

}
