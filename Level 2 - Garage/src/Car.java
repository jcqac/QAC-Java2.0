
public class Car extends Vehicle
{
private int doors;
private double engineSize;
private String bodyType;

	public Car(String nPlate, String man, String mod, String eType, int wheel, int door, double eSize, String bType)
	{
		super("Car", nPlate, man, mod, eType, wheel);
		doors = door;
		engineSize = eSize;
		bodyType = bType;
	}
	
	public int getNoDoors()
	{
		return doors;
	}
	
	public void setDoors(int d)
	{
		doors = d;
	}
	
	public double getEngineSize()
	{
		return engineSize;
	}
	
	public void setEngineSize(int s)
	{
		engineSize = s;
	}
	
	public String getBodyType()
	{
		return bodyType;
	}
	
	public void setBodyType(String t)
	{
		bodyType = t;
	}
	
	public String toString()
	{
		return super.toString() + "\nNumber of Doors: " + doors + "\nEngine Size: " + engineSize + "\nBody Type: " + bodyType;
	}
}
