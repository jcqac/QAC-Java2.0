import java.io.*;

public class Conditionals {
	private static BufferedReader myIn = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("This is an adder or multiplier");
		System.out.println("\nEnter first number: ");
		int a = Integer.parseInt(myIn.readLine());
		System.out.println("\nEnter second number: ");
		int b = Integer.parseInt(myIn.readLine());
		
		System.out.println("\nIs this going to be a multiplication? True or False? ");
		boolean tf = Boolean.parseBoolean(myIn.readLine());
		
		if(tf == true)
		{
			System.out.println("\nResult: " + "\n" + mult(a,b));
		}
		else
		{
			System.out.println("\nResult: " + "\n" + sum(a,b));
		}
	}
	
	private static int sum(int a, int b)
	{
		return a+b;
	}
	
	private static int mult(int a, int b)
	{
		return a*b;
	}
	
	
}


