import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TooHot {
	private static int lLimit = 60;
	private static int uLimit = 90;
	
	private static BufferedReader myIn = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter a temperature in Farenheit - the system will respond if it's too hot or not.");
		System.out.println("\nEnter temperature (fahrenheit): ");
		int a = Integer.parseInt(myIn.readLine());
		System.out.println("\nIs it summer? True or False? ");
		boolean b = Boolean.parseBoolean(myIn.readLine());
		
		System.out.println("\nTooHot: " + tempCheck(a,b));
		
	}
	
	private static boolean tempCheck(int a, boolean b)
	{	
		if (lLimit <= a && a <= returnLimit(b))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	private static int returnLimit(boolean b)
	{
		if (b)
		{
			return uLimit + 10;
		}
		else
		{
			return uLimit;
		}
	}
}
