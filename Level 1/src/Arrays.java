import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrays {	
	private static BufferedReader myIn = new BufferedReader(new InputStreamReader(System.in));
	
	private static int[] result = new int[10];
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		// TODO Auto-generated method stub
		
		System.out.println("This is an adder, should any number be 0 the other number is returned instead. \n There will be 10 rounds of this. Results will be outputted at the end");
		
		for (int i = 0; i < 10; i++) 
		{
			System.out.println("Round" + (i+1));
			System.out.println("Enter first number: ");
			int a = Integer.parseInt(myIn.readLine());
			System.out.println("Enter second number: ");
			int b = Integer.parseInt(myIn.readLine());
			result[i] = sum(a,b);
		}
		System.out.println("Finished.");
		System.out.println("Results: \n");
		for (int i = 0; i < 10; i++) 
		{
			System.out.println(result[i]);
		}
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


