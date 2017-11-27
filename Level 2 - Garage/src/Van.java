public class Van extends Vehicle

{
	private int doors;
	private int maxWeight;
	private int capacity;
	
	public Van(String nPlate, String man, String mod, String eType, int wheel, int door, double eSize, int weight, int cap)
	{
		super("Van", nPlate, man, mod, eType, wheel);
		doors = door;
		maxWeight = weight;
		capacity = cap;
	}
		
	public int getMaxWeight()
	{
		return maxWeight;
	}
	
	public int getMaxCapacity()
	{
		return capacity;
	}
	
	public String toString()
	{
		return super.toString() + "\nNumber of Doors: " + doors + "\nMax Weight: " + maxWeight + "kg" + "\nCapacity: " + capacity + "l";
	}
}

