public class factorial {

	public static void main(String[] args) {

		int a = 5;
		int i, fact=1;
		for (i=a; i>0; i--)
		{
		    fact = fact * i;
		}
		System.out.println("factorial of " + a + " is " + fact);
	}

}
