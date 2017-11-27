
public class Tester 
{
	public static void main(String[] args) 
	{
		// Add the three paints
		Paint cheap = new Paint("CheapoMax", 20, 19.99, 10);
		Paint average = new Paint("AverageJoes", 15, 17.99, 11);
		Paint dulux = new Paint ("DuluxourousPaints", 10, 25, 20);
		
		//Tester Room
		Wall wall1 = new Wall(27,45);
		Wall wall2 = new Wall(27,45);
		Wall wall3 = new Wall(100,45);
		Wall wall4 = new Wall(100,45);
		
		Room room = new Room();
		//Add walls to a room
		room.AddWalls(wall1);
		room.AddWalls(wall2);
		room.AddWalls(wall3);
		room.AddWalls(wall4);
		
		Logic test = new Logic();
		test.addRoom(room);
		//Add paint to logic
		test.addPaint(cheap);
		test.addPaint(average);
		test.addPaint(dulux);
		
		System.out.println(test.formatCosts());
		System.out.println(test.findCheapest());
	}
}
