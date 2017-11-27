import java.io.*;

public class Operators {
	private static BufferedReader myIn = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("This is the aditionator");
		System.out.println("\nEnter first number: ");
		int a = Integer.parseInt(myIn.readLine());
		System.out.println("\nEnter second number: ");
		int b = Integer.parseInt(myIn.readLine());
		System.out.println("\nResult: " + "\n" + sum(a,b));
		
	}
	
	private static int sum (int a, int b)
	{
		return a+b;
	}
	
	
}
