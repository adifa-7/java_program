
public class palindrome {

	public static void main(String[] args) {
		
		int x = 121;
		int r, sum=0;
		int temp = x;
		while(x>0)
		{
		    r = x % 10;
		    sum = (sum*10) + r;
		    x = x / 10;
		}
		if(sum == temp)
		{
		    System.out.println("Is palindrome");
		}
		else
		{
	    	System.out.println("Not a palindrome");
    	}
}
}