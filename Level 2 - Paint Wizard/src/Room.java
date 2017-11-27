import java.util.ArrayList;

public class Room 
{
	private ArrayList<Wall> allWalls = new ArrayList<Wall>();
	
	public void AddWalls(Wall wal)
	{
		allWalls.add(wal);
	}
	
	public double totalArea()
	{
		double temp = 0;
		for(Wall wall: allWalls)
		{
			temp += wall.calArea();
		}
		return temp;
	}
}
