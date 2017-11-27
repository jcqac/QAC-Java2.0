import java.io.*;

public class Parameters {
	
	private static BufferedReader myIn = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		while (true)
		{
			System.out.println("Type anything you like, type quit to exit");
			String in = myIn.readLine();
			if(in.equals("quit"))
			{
				System.out.println("Program has stopped");
				break;
			}
			System.out.println(hw(in));
		}
	
	}
	
	private static String hw(String str)
	{
		String temp = str;
		return temp;
	}
}
