import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BlackJack {
	private static BufferedReader myIn = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		// TODO Auto-generated method stub
		System.out.println("This works out who won blackjack.");
		System.out.println("\nPerson A - Number: ");
		int a = Integer.parseInt(myIn.readLine());
		System.out.println("\nPerson B - Number: ");
		int b = Integer.parseInt(myIn.readLine());
		System.out.println("\nResult: " + "\n" + calc(a,b));
	}
	
	private static int calc(int a, int b) 
	{
		int a1 = Math.abs(a - 21);
		int b1 = Math.abs(b - 21);
		
		if ((a1 < b1) && (a <= 21))
		{
			return a;
		}
		else if ((b1 < a1) && (b <= 21))
		{
			return b;
		}
		else if ((a > 21) && (b <= 21))
		{
			return b;
		}
		else if ((b > 21) && (a <= 21))
		{
			return a;
		}
		else
		{
			return 0;
		}
	}

}
