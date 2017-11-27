import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrays2 {	
	private static BufferedReader myIn = new BufferedReader(new InputStreamReader(System.in));
	
	private static int[] result = new int[10];
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		// TODO Auto-generated method stub
		
		System.out.println("This is an *10-er - Input 10 numbers and this program will return these numbers 10 times larger");
		
		for (int i = 0; i < 10; i++) 
		{
			int temp = Integer.parseInt(myIn.readLine());
			result[i] = temp;
			System.out.println(temp);
		}
		
		for (int i = 0; i < 10; i++) 
		{
			System.out.println(result[i]*10);
		}
	}	
}


