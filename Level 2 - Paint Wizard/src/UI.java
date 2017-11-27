import java.util.Scanner;

public class UI {

	public static void main(String[] args) 
	{
		// Add the three paints
			Paint cheap = new Paint("CheapoMax", 20, 19.99, 10);
			Paint average = new Paint("AverageJoes", 15, 17.99, 11);
			Paint dulux = new Paint ("DuluxourousPaints", 10, 25, 20);
			
			Room room = new Room();
			
			Logic log = new Logic();
			
			log.addRoom(room);
			log.addPaint(cheap);
			log.addPaint(average);
			log.addPaint(dulux);
			
			Scanner myInput = new Scanner(System.in);
			System.out.print("How many walls do you have? - Positive numbers only\n");
			int x = myInput.nextInt();
			int count = 0;
			while(count < x)
			{
				System.out.println("\nWall " + (count+1));
				System.out.println("Please enter a width in metres");
				int w = myInput.nextInt();
				System.out.println("Please enter a height in metres");
				int h = myInput.nextInt();
				
				Wall temp = new Wall(w,h);
				room.AddWalls(temp);
				count++;
			}
			myInput.close();
			System.out.println("##### START #####\n");
			System.out.println("Here are the results:\n");
			System.out.println(log.formatCosts());
			System.out.println(log.findCheapest());
			System.out.println(log.wasteLeast());
			
			System.out.println("\n##### END #####");
					
	}

}
