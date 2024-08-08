package adifa;

public class swap_num {

	public static void main(String[] args) {
		System.out.println("Numbers after Swapping:");
		int a = 5;
		int b = 7;
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println(a);
		System.out.println(b);
	}

}
