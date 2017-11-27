import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UniqueSum {
	private static BufferedReader myIn = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("This is the unique additionator please input 3 numbers. \nif any numbers are the same they will not be added together.");
		System.out.println("\nEnter first number: ");
		int a = Integer.parseInt(myIn.readLine());
		System.out.println("\nEnter second number: ");
		int b = Integer.parseInt(myIn.readLine());
		System.out.println("\nEnter third number: ");
		int c = Integer.parseInt(myIn.readLine());
		System.out.println("\nResult: " + "\n" + sum(a,b,c));
		
	}
	
	private static int sum (int a, int b, int c)
	{	
		if((a==b)&&(a==c)&&(b==c))
		{
			return 0;
		}
		else if (a==b)
		{
			return c;
		}
		else if (a==c)
		{
			return b;
		}
		else if(b==c)
		{
			return a;
		}
		else
		{
			return a+b+c;
		}
	}
}
