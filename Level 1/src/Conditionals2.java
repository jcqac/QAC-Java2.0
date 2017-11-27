import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Conditionals2 {
	private static BufferedReader myIn = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("This is an adder, should any number be 0 the other number is returned instead.");
		System.out.println("\nEnter first number: ");
		int a = Integer.parseInt(myIn.readLine());
		System.out.println("\nEnter second number: ");
		int b = Integer.parseInt(myIn.readLine());
		
		System.out.println("\nResult: " + "\n" + sum(a,b));
			
	}
	
	private static int sum(int a, int b)
	{
		if (a == 0)
		{
			return b;
		}
		else if (b == 0)
		{
			return a;
		}
		else
		{
			return a+b;
		}
	}

	
	
}


