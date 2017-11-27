public class Iteration {	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 10; i++) 
		{
			System.out.println(sum(1,i));
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


